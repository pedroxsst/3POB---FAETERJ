# Lista 13 — Arquivos em Java

Cinco exercícios com a API `java.nio.file`: criação de diretórios, leitura de logs e CSV, busca de arquivos e transformação de texto.

## Exercícios

| Exercício | Tema | Métodos principais |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Criar um relatório | `Path.of`, `createDirectories`, `writeString` |
| [02](Exercicio02/Main.java) | Filtrar erros de um log | `Files.lines`, `filter`, `map` |
| [03](Exercicio03/Main.java) | Calcular o inventário de produtos | `readAllLines`, `split`, conversões numéricas |
| [04](Exercicio04/Main.java) | Buscar arquivos Java em subpastas | `Files.walk`, `isRegularFile`, `size` |
| [05](Exercicio05/Main.java) | Padronizar nomes de clientes | `Files.lines`, `trim`, `isBlank`, `Files.write` |

## Como executar

Use **JDK 17 ou superior**. Alguns exercícios utilizam `Stream.toList()`.

Abra o terminal na **raiz do repositório**, onde ficam as pastas das listas. Os caminhos dos arquivos partem dessa pasta.

```sh
javac -encoding UTF-8 Lista13/Exercicio01/Main.java
java -cp . Lista13.Exercicio01.Main
```

Troque `Exercicio01` por `Exercicio02`, `Exercicio03`, `Exercicio04` ou `Exercicio05` nos dois comandos. Os programas são independentes e não pedem entrada pelo teclado.

## Arquivos e resultados

### 1. Relatório

Cria `Lista13/Exercicio01/dados/relatorios/sumario.txt` com cabeçalho, data e hora da execução e uma mensagem de status. `CREATE` cria o arquivo quando necessário; `TRUNCATE_EXISTING` substitui o conteúdo anterior.

### 2. Log do servidor

Lê [servidor.log](Exercicio02/servidor.log). O exemplo tem dois erros:

```text
Total de erros: 2
Falha de conexao
Timeout no banco
```

O filtro usa o prefixo exato `[ERROR] `. As linhas de INFO e WARN não entram no resultado. O `try-with-resources` fecha a Stream e o arquivo após a leitura.

### 3. Produtos em CSV

Lê [produtos.csv](Exercicio03/produtos.csv). O formato é simples, com três campos separados por vírgulas e preço decimal com ponto, sem aspas nem vírgulas dentro do nome.

Resultados do exemplo:

```text
Monitor: R$ 6000,00
Teclado: R$ 1500,00
Mouse: R$ 1600,00
Total do inventario: R$ 9100,00
```

O separador exibido depende da configuração regional do Java. Se uma linha tiver campos incorretos ou números inválidos, o programa informa a linha e encerra sem apresentar um total global incompleto. Quantidade e preço devem ser não negativos e os valores precisam caber nos tipos usados.

### 4. Varredura de arquivos

Percorre `Lista13` e todas as suas subpastas. Mostra somente arquivos regulares com extensão `.java`, com caminho relativo à pasta Lista13, tamanho em bytes e total.

O total depende do conteúdo dos arquivos. Para examinar outra pasta, altere o `Path.of("Lista13")`. `Files.walk` faz a busca recursiva; `Files.list` listaria apenas o primeiro nível e não é necessário nesta solução.

### 5. Clientes padronizados

Lê [clientes_bruto.txt](Exercicio05/clientes_bruto.txt) e gera `Lista13/Exercicio05/clientes_padronizado.txt`:

```text
ANA SILVA
CARLOS SOUZA
BEATRIZ LIMA
JOÃO COSTA
```

A sequência remove espaços das extremidades, elimina linhas em branco e converte os nomes para caixa alta. O arquivo de entrada é preservado.

Para fazer a substituição atômica mencionada no enunciado, o programa escreve com `Files.write` em um arquivo temporário na mesma pasta e depois usa `Files.move` com `ATOMIC_MOVE`. Assim, a saída só é substituída depois de pronta. Se o sistema de arquivos não oferecer esse recurso, o programa informa o problema. O bloco `finally` tenta remover qualquer temporário restante.

## Para praticar

- Execute o exercício 1 duas vezes e confira a atualização do relatório.
- Acrescente uma linha `[ERROR] Mensagem de teste` ao log e rode o exercício 2.
- Troque uma quantidade do CSV por uma palavra e confira o tratamento de erro.
- Adicione um arquivo de texto em uma subpasta e veja que ele não aparece na busca por Java.
- Inclua nomes com espaços e linhas vazias na entrada do exercício 5.

Todos os arquivos de texto são lidos ou escritos em UTF-8. Os arquivos gerados pelos exercícios 1 e 5 e os temporários ficam fora do versionamento, conforme o [.gitignore](.gitignore) desta lista.

[Voltar ao início](../README.md)
