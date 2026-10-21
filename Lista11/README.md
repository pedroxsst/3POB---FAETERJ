# Lista 11 — API Streams e interfaces funcionais

Cinco exercícios sobre processamento de listas com Streams, expressões lambda e interfaces funcionais. Os dados de exemplo já estão definidos nos programas; não é necessário digitar entradas.

## Exercícios

| Exercício | Tema | Conteúdo |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Filtragem de nomes | `filter`, `map`, `sorted` e `toList` |
| [02](Exercicio02/Main.java) | Estatísticas de produtos | `mapToDouble`, `sum`, `average`, `max` e `Optional` |
| [03](Exercicio03/Main.java) | Agrupamento de alunos | `groupingBy` e `partitioningBy` |
| [04](Exercicio04/Main.java) | Transformação de textos | `@FunctionalInterface`, lambdas e referências a métodos |
| [05](Exercicio05/Main.java) | Salários de funcionários de TI | `Predicate`, `Function` e `Consumer` |

As classes [Produto](Exercicio02/Produto.java), [Aluno](Exercicio03/Aluno.java) e [Funcionario](Exercicio05/Funcionario.java), assim como a interface [TransformadorTexto](Exercicio04/TransformadorTexto.java), ficam em arquivos próprios.

## Como executar

Use **JDK 17 ou superior**. Os exercícios 1 e 4 usam `Stream.toList()`, disponível a partir do Java 16.

Na raiz do repositório, compile e execute o exercício desejado:

```sh
javac -encoding UTF-8 Lista11/Exercicio01/*.java
java -cp . Lista11.Exercicio01.Main
```

Troque `Exercicio01` por `Exercicio02`, `Exercicio03`, `Exercicio04` ou `Exercicio05` nos dois comandos. Compile todos os arquivos da pasta para incluir as classes auxiliares.

## Entendendo as soluções

1. **Nomes:** `filter` seleciona os nomes que começam com A, sem distinguir maiúsculas e minúsculas. `map` converte para caixa alta, `sorted` ordena e `toList` reúne o resultado. A lista original é preservada.
2. **Produtos:** cada cálculo começa uma nova Stream, pois uma Stream não pode ser reutilizada depois da operação terminal. `average` e `max` podem não ter resultado em uma lista vazia; por isso retornam `OptionalDouble` e `Optional<Produto>`. O exemplo usa `orElse(0)` para a média e `ifPresent` para exibir o produto.
3. **Alunos:** `groupingBy` cria um grupo por curso. `partitioningBy` cria os grupos `true` (aprovados) e `false` (reprovados). A nota deve ser **maior que 7.0** para aprovar; Bruno, com nota 7.0, fica entre os reprovados. O método `toString` permite mostrar os alunos pelo nome e nota.
4. **Textos:** `TransformadorTexto` define uma única operação. O método `processarLista` aplica a regra recebida a cada texto. As duas primeiras chamadas usam lambdas; a terceira usa a referência de método `String::toUpperCase`.
5. **Funcionários:** `Predicate` decide quem passa no filtro, `Function` transforma cada funcionário em um salário projetado e `Consumer` imprime esse valor. O reajuste é apenas uma projeção; o salário do objeto não é alterado.

## Resultados dos exemplos

- **Exercício 1:** `[AMANDA, ANA, ANTONIO]`.
- **Exercício 2:** total de R$ 5000,00; média de R$ 833,33; produto mais caro: Notebook, R$ 3500,00.
- **Exercício 3:** ADS reúne Ana, Bruno e Fabio; Engenharia reúne Carla e Diego; Administracao reúne Elisa. Aprovados: Ana, Carla e Elisa. Reprovados: Bruno, Diego e Fabio. A ordem de exibição dos cursos pode variar.
- **Exercício 4:** invertidos `[avaj, smaerts, adbmal]`; entre colchetes `[[java], [streams], [lambda]]`; maiúsculos `[JAVA, STREAMS, LAMBDA]`.
- **Exercício 5:** salários projetados de R$ 3300,00 e R$ 4400,00, apenas para os funcionários de TI.

O separador decimal exibido depende da configuração regional do Java.

[Voltar ao início](../README.md)
