# Lista 11 — Coleções em Java

Cinco exercícios com `ArrayList`, `HashSet` e `HashMap`, usando laços simples para percorrer as coleções.

## Exercícios

| Exercício | Tema | Operações principais |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Lista de tarefas | `add`, `remove`, `contains` e `Collections.sort` |
| [02](Exercicio02/Main.java) | Matrículas de duas turmas | `HashSet`, `addAll` e `retainAll` |
| [03](Exercicio03/Main.java) | Frequência de palavras | `HashMap`, `getOrDefault`, `put` e `entrySet` |
| [04](Exercicio04/Main.java) | Controle de estoque | Inserção, consulta, atualização e alerta |
| [05](Exercicio05/Main.java) | Produtos por categoria | `ArrayList<Produto>` e `HashMap<String, List<Produto>>` |

As classes [Estoque](Exercicio04/Estoque.java) e [Produto](Exercicio05/Produto.java) ficam em arquivos próprios.

## Como executar

Com o JDK instalado, abra o terminal na **raiz do repositório**:

```sh
javac -encoding UTF-8 Lista11/Exercicio01/*.java
java -cp . Lista11.Exercicio01.Main
```

Para outro exercício, troque `Exercicio01` por `Exercicio02`, `Exercicio03`, `Exercicio04` ou `Exercicio05` nos dois comandos. Compile todos os arquivos da pasta, incluindo as classes auxiliares.

Estas soluções são compatíveis com Java 8 ou superior. Para executar também as listas 12 e 13, use JDK 17 ou superior.

## Entradas e resultados

### 1. Lista de tarefas

Digite cinco tarefas, uma por linha. Depois, informe o nome da tarefa a remover e o nome da tarefa que deseja consultar.

Exemplo de entrada, seguindo a ordem das perguntas:

```text
estudar
lavar roupa
comprar pao
ler
caminhar
lavar roupa
ler
```

O programa remove `lavar roupa`, encontra `ler` e mostra:

```text
caminhar
comprar pao
estudar
ler
```

A remoção por nome elimina a primeira ocorrência. A remoção e a consulta comparam o texto exatamente, distinguindo maiúsculas, minúsculas e espaços. A ordenação usa a ordem natural das Strings com `Collections.sort`.

### 2. Matrículas

Informe a quantidade de matrículas da turma A, as matrículas, a quantidade da turma B e suas matrículas. A quantidade considera todas as entradas, inclusive repetidas. Use zero para representar uma turma vazia.

Exemplo:

```text
4
101
102
102
103
3
102
104
104
```

A turma A fica com 101, 102 e 103; a B fica com 102 e 104. A união contém 101, 102, 103 e 104. A interseção contém apenas 102.

As operações usam cópias dos conjuntos, preservando as turmas originais. `HashSet` não garante a ordem de exibição.

### 3. Frequência de palavras

Para a frase:

```text
Java e legal Java e simples
```

As contagens são: `java: 2`, `e: 2`, `legal: 1` e `simples: 1`.

`toLowerCase` uniformiza as letras e `split("\\s+")` separa por um ou mais espaços ou tabulações. `getOrDefault(palavra, 0)` fornece zero quando a palavra ainda não existe no mapa.

Uma frase vazia não gera uma palavra vazia. A pontuação é mantida: `java` e `java,` são chaves diferentes, pois o enunciado pede apenas separação por espaços.

### 4. Estoque

O exemplo cadastra P001 com 10 unidades, P002 com 2, P003 com 0 e P004 com 5. Depois, retira 7 unidades de P001 e adiciona 4 a P002.

Com alerta abaixo de 5, aparecem **P001 com 3 unidades** e **P003 com 0 unidades**. P004, com exatamente 5, não entra no alerta.

O método `atualizarQuantidade` recebe uma alteração: valores positivos adicionam estoque e negativos retiram. Códigos inexistentes, cadastros repetidos e quantidades inválidas são informados sem alterar o estoque. O exemplo também tenta atualizar P999 e retirar uma unidade de P003, para mostrar as validações.

### 5. Produtos por categoria

O programa usa seis produtos já definidos no código:

- **Informática:** Mouse e Teclado.
- **Alimentos:** Arroz e Feijao.
- **Livros:** Java Basico e Logica de Programacao.

Ao encontrar uma categoria pela primeira vez, cria uma lista vazia dentro do mapa. Em seguida, adiciona o produto à lista daquela categoria. A exibição mostra o título da categoria, os nomes e os preços formatados.

## Observações

Os exercícios 1 a 3 recebem entrada pelo teclado. Os exercícios 4 e 5 usam exemplos prontos.

`HashMap` não garante a ordem de exibição das palavras, códigos ou categorias. Os valores continuam corretos mesmo que a ordem mude. O separador decimal dos preços depende da configuração regional do Java.

[Voltar ao início](../README.md)
