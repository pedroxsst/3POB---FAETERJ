# Lista 10 — Tratamento de exceções

Resolução dos cinco exercícios do documento de exceções em Java.

## Exercícios

| Exercício | Tema | Conteúdo |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Divisão segura | `ArithmeticException`, `InputMismatchException`, múltiplos `catch` e `finally` |
| [02](Exercicio02/Main.java) | Conversão de vetor | `NumberFormatException` e `ArrayIndexOutOfBoundsException` |
| [03](Exercicio03/Main.java) | Conta corrente | Exceção verificada `SaldoInsuficienteException`, `throw` e `throws` |
| [04](Exercicio04/Main.java) | Cadastro de eleitor | Exceção não verificada `IdadeInvalidaException` |
| [05](Exercicio05/Main.java) | Processamento simulado | Encadeamento de exceções com `super(mensagem, causa)` e `getCause()` |

## Como executar

Com o JDK instalado, abra o terminal na raiz do repositório.

Para compilar e executar o exercício 1:

```sh
javac -encoding UTF-8 Lista10/Exercicio01/*.java
java -cp . Lista10.Exercicio01.Main
```

Para outro exercício, troque `Exercicio01` por `Exercicio02`, `Exercicio03`, `Exercicio04` ou `Exercicio05` nos dois comandos.

## Entradas e demonstrações

- **Exercício 1:** recebe dois inteiros pelo teclado. A divisão é inteira: `7 / 2` resulta em `3`. Teste também divisor zero e uma entrada como `abc`. O `finally` fecha o `Scanner` e exibe `Operação finalizada.`.
- **Exercício 2:** recebe um índice de 0 a 3. O vetor é `{"10", "25", "abc", "50"}`. O índice 2 causa falha de conversão; índices como -1 e 4 são inexistentes. Entrada não inteira também é tratada.
- **Exercício 3:** usa uma conta com saldo inicial de R$ 500 e tenta saques de R$ 200 e R$ 400. O primeiro deixa R$ 300; o segundo lança a exceção e mantém o saldo.
- **Exercício 4:** tenta cadastrar idades 20, 0, 130, -1 e 131. O intervalo aceito pelo enunciado é de 0 a 130, inclusive; não há verificação de aptidão para votar.
- **Exercício 5:** usa conteúdo simulado. `dados.txt` representa o valor `42`; caminho nulo ou vazio causa `IOException`; `dados_invalidos.txt` representa `abc` e causa `NumberFormatException`. Nenhum arquivo externo é necessário. As falhas são encapsuladas em `ProcessamentoDadosException`, preservando a causa original.

`SaldoInsuficienteException` e `ProcessamentoDadosException` herdam de `Exception` e são declaradas com `throws`. `IdadeInvalidaException` herda de `RuntimeException`, portanto essa declaração não é obrigatória.

[Voltar ao início](../README.md)
