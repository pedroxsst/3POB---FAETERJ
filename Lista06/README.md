# Lista 06 — Introdução à orientação a objetos

Exercícios com classes, objetos, atributos, métodos, parâmetros e valores de retorno.

## Exercícios

| Exercício | Tema | Conteúdo |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Livro | Criação de dois objetos e exibição de atributos |
| [02](Exercicio02/Main.java) | Circulo | Área e perímetro com métodos de retorno |
| [03](Exercicio03/Main.java) | ContaBancaria | Depósitos, saques e validação de valores |
| [04](Exercicio04/Main.java) | Funcionario | Aumento percentual e desconto fixo |
| [05](Exercicio05/Main.java) | Aluno | Média, situação e boletim |

## Como executar

Com o JDK instalado, abra o terminal na **raiz do repositório**, onde ficam as pastas Lista01 a Lista06.

Para compilar e executar o exercício 1:

```sh
javac -encoding UTF-8 Lista06/Exercicio01/Main.java
java -cp . Lista06.Exercicio01.Main
```

Para outro exercício, troque Exercicio01 por Exercicio02, Exercicio03, Exercicio04 ou Exercicio05 nos dois comandos. Cada pasta tem seu próprio Main.java, separado por pacote.

Nos programas que recebem números decimais, use o separador aceito pela configuração regional do Java: vírgula ou ponto.

## Observações

Os valores de livros, conta, funcionário e aluno são exemplos para teste. No exercício 5, a aprovação exige média maior que 7; média exatamente 7 resulta em Reprovado, conforme o enunciado.

[Voltar ao início](../README.md)
