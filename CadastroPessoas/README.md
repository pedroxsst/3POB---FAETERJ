# Cadastro de pessoas

Atividade de 3POB: cadastro de pessoas em Java, com MVC, ArrayList, tratamento de exceções e persistência em arquivo de texto.

## Funcionalidades

- Incluir uma pessoa com ID, nome, idade e altura.
- Alterar nome, idade e altura pelo ID, mantendo o mesmo identificador.
- Excluir uma pessoa pelo ID.
- Listar as pessoas cadastradas.
- Carregar os dados ao iniciar e salvar após cada inclusão, alteração ou exclusão.

O ID é um inteiro positivo e não pode se repetir. O nome é obrigatório, a idade deve ser um inteiro não negativo e a altura deve ser positiva e finita. No teclado, a altura aceita ponto ou vírgula, por exemplo, `1.75` ou `1,75`.

## Organização MVC

| Arquivo | Responsabilidade |
| --- | --- |
| `App.java` | Iniciar o programa. |
| `model/Pessoa.java` | Representar e validar uma pessoa. |
| `model/PessoaCadastro.java` | Manter o ArrayList e as operações do cadastro. |
| `view/PessoaView.java` | Exibir o menu e receber dados pelo teclado. |
| `controller/PessoaController.java` | Coordenar a interação entre a view, o cadastro e o arquivo. |
| `arquivo/PessoaArquivo.java` | Ler e gravar o CSV. |

Cada classe fica em seu próprio arquivo, com pacotes correspondentes às pastas.

## Como executar

Use JDK 17 ou superior. Abra o terminal **na raiz do repositório**, onde ficam as pastas das listas e a pasta CadastroPessoas.

Compile:

```sh
javac -encoding UTF-8 CadastroPessoas/App.java CadastroPessoas/model/*.java CadastroPessoas/view/*.java CadastroPessoas/controller/*.java CadastroPessoas/arquivo/*.java
```

Execute:

```sh
java -cp . CadastroPessoas.App
```

Escolha uma das opções do menu e informe os dados solicitados. A opção `0` encerra o programa. Para alterar, informe o ID existente e preencha todos os demais dados novamente.

## Arquivo pessoas.csv

O arquivo fica em `CadastroPessoas/pessoas.csv`, usa UTF-8 e começa com o cabeçalho:

```text
id;nome;idade;altura
```

Exemplo de registro (apenas ilustrativo):

```text
1;Ana Silva;22;1.68
```

O separador é ponto e vírgula, e a altura é gravada com ponto decimal. Nomes não podem conter ponto e vírgula ou quebras de linha; vírgulas e acentos são aceitos.

O CSV publicado começa sem pessoas cadastradas. Se ele não existir, será criado no primeiro cadastro. Um arquivo existente com cabeçalho ou registros inválidos impede a abertura do programa, com uma mensagem de erro, para permitir a correção dos dados.

Cada alteração é escrita primeiro em um arquivo temporário. O cadastro em memória só é atualizado depois que a gravação termina com sucesso.

## Verificação automática

O GitHub Actions compila o projeto e verifica as quatro operações, a persistência entre execuções, entradas inválidas e erros de arquivo. Os testes usam uma pasta temporária e não alteram o CSV do repositório.
