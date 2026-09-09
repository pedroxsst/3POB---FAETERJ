# Lista 03 — Estruturas de repetição

Exercícios com for e while, contadores, acumuladores e condições de parada.

## Exercícios

| Exercício | Tema | Conteúdo |
| --- | --- | --- |
| [01](Exercicio01/Main.java) | Tabuada de 1 a 10 | Laço for e multiplicação |
| [02](Exercicio02/Main.java) | Somatório e média | Leitura até um número negativo |
| [03](Exercicio03/Main.java) | Validação de senha | Repetição até a senha correta |
| [04](Exercicio04/Main.java) | Contagem de pares e ímpares | Percurso de um intervalo e contadores |
| [05](Exercicio05/Main.java) | Fatorial de um número | Laço e acumulador de produto |

## Como executar

Com o JDK instalado, abra o terminal na **raiz do repositório**, onde ficam as pastas Lista01 a Lista06.

Para compilar e executar o exercício 1:

```sh
javac -encoding UTF-8 Lista03/Exercicio01/Main.java
java -cp . Lista03.Exercicio01.Main
```

Para outro exercício, troque Exercicio01 por Exercicio02, Exercicio03, Exercicio04 ou Exercicio05 nos dois comandos. Cada pasta tem seu próprio Main.java, separado por pacote.

Nos programas que recebem números decimais, use o separador aceito pela configuração regional do Java: vírgula ou ponto.

## Observações

A senha de exemplo do exercício 3 é 2026. O exercício 5 usa int para o fatorial; use entradas de 0 a 12 para obter resultados dentro da capacidade desse tipo.

[Voltar ao início](../README.md)
