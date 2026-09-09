# Lista 06 — Introdução à orientação a objetos

1. Livro: atributos, criação de objetos e exibição de informações.
2. Circulo: métodos com retorno, área e perímetro.
3. ContaBancaria: parâmetros, depósitos e saques com validação.
4. Funcionario: aumento percentual e desconto fixo.
5. Aluno: média, aprovação e boletim.

Cada pasta contém um Main.java com a classe do exercício e a classe principal.
Os pacotes separam os exercícios para que as classes Main não entrem em conflito.

## Como executar

Com o JDK instalado, abra o terminal na raiz do repositório e execute, por exemplo:

```sh
javac -encoding UTF-8 Lista06/Exercicio01/Main.java
java -cp . Lista06.Exercicio01.Main
```

Para executar outro exercício, substitua Exercicio01 por Exercicio02, Exercicio03, Exercicio04 ou Exercicio05 nos dois comandos.

No exercício 2, a entrada decimal segue a configuração regional do Java.
Se necessário, use vírgula em vez de ponto.

Os valores de livros, conta, funcionário e aluno são exemplos para teste.
No exercício 5, média igual a 7 resulta em Reprovado, conforme a regra do enunciado.
