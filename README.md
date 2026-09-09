# 3POB — FAETERJ

Repositório de exercícios em Java da disciplina 3POB, com atividades de lógica de programação e introdução à programação orientada a objetos.

As seis listas reúnem 30 exercícios, passando por entrada de dados, condicionais, repetições, vetores, matrizes e classes.

## Listas

| Lista | Conteúdo | Exercícios |
| --- | --- | --- |
| [Lista 01](Lista01/README.md) | Entrada de dados e operações básicas | 5 |
| [Lista 02](Lista02/README.md) | Estruturas condicionais | 5 |
| [Lista 03](Lista03/README.md) | Estruturas de repetição | 5 |
| [Lista 04](Lista04/README.md) | Vetores | 5 |
| [Lista 05](Lista05/README.md) | Matrizes | 5 |
| [Lista 06](Lista06/README.md) | Introdução à orientação a objetos | 5 |

## Organização

Cada lista tem um README com os temas e as instruções de execução. Cada exercício fica em uma pasta própria:

```text
3POB---FAETERJ/
├── README.md
├── Lista01/
│   ├── README.md
│   ├── Exercicio01/
│   │   └── Main.java
│   ├── Exercicio02/
│   │   └── Main.java
│   ├── Exercicio03/
│   │   └── Main.java
│   ├── Exercicio04/
│   │   └── Main.java
│   └── Exercicio05/
│       └── Main.java
├── Lista02/  (mesma organização)
├── Lista03/  (mesma organização)
├── Lista04/  (mesma organização)
├── Lista05/  (mesma organização)
└── Lista06/  (mesma organização)
```

O pacote identifica a lista e o exercício. Por exemplo, `Lista01.Exercicio01` corresponde à pasta `Lista01/Exercicio01`. Isso permite que cada programa tenha uma classe chamada `Main` sem conflito com os demais.

Na Lista06, o Main.java também contém a classe trabalhada no exercício, como Livro ou Aluno.

## Como executar

É necessário ter o **JDK** instalado e os comandos `java` e `javac` disponíveis no terminal. Os exercícios usam apenas a biblioteca padrão do Java.

1. Baixe o repositório ou faça o clone:

   ```sh
   git clone https://github.com/pedroxsst/3POB---FAETERJ.git
   cd 3POB---FAETERJ
   ```

2. Na raiz do repositório, compile o exercício desejado:

   ```sh
   javac -encoding UTF-8 Lista01/Exercicio01/Main.java
   ```

3. Execute usando o nome completo do pacote e da classe:

   ```sh
   java -cp . Lista01.Exercicio01.Main
   ```

Para escolher outro programa, ajuste a lista e o exercício nos dois comandos. Por exemplo, para o exercício 2 da Lista06:

```sh
javac -encoding UTF-8 Lista06/Exercicio02/Main.java
java -cp . Lista06.Exercicio02.Main
```

Também é possível abrir a raiz do repositório em uma IDE com suporte a Java e executar o método main do exercício escolhido.

## Notas de estudo

- Os enunciados ou resumos estão nos comentários dos arquivos Java.
- Alguns exercícios recebem dados pelo teclado; outros usam valores definidos no código. Consulte o README da lista.
- A leitura e a exibição de números decimais seguem a configuração regional do Java.
- Os arquivos .class gerados pela compilação são ignorados pelo .gitignore.
- As regras de cálculo e aprovação pertencem a cada exercício. Na Lista02, média 7 aprova; na Lista06, o enunciado exige média maior que 7.
