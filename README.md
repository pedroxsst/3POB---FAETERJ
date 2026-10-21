# 3POB — FAETERJ

Repositório de exercícios em Java da disciplina 3POB, com atividades de lógica de programação e programação orientada a objetos.

As 11 listas disponíveis reúnem 55 exercícios, passando por entrada de dados, condicionais, repetições, vetores, matrizes, classes, encapsulamento, herança, polimorfismo, classes abstratas, interfaces, tratamento de exceções, API Streams e interfaces funcionais.

## Listas

| Lista | Conteúdo | Exercícios |
| --- | --- | --- |
| [Lista 01](Lista01/README.md) | Entrada de dados e operações básicas | 5 |
| [Lista 02](Lista02/README.md) | Estruturas condicionais | 5 |
| [Lista 03](Lista03/README.md) | Estruturas de repetição | 5 |
| [Lista 04](Lista04/README.md) | Vetores | 5 |
| [Lista 05](Lista05/README.md) | Matrizes | 5 |
| [Lista 06](Lista06/README.md) | Introdução à orientação a objetos | 5 |
| [Lista 07](Lista07/README.md) | Herança e polimorfismo | 5 |
| [Lista 08](Lista08/README.md) | Sobrecarga de construtores e encapsulamento | 5 |
| [Lista 09](Lista09/README.md) | Classes abstratas e interfaces | 5 |
| [Lista 10](Lista10/README.md) | Tratamento de exceções | 5 |
| [Lista 12](Lista12/README.md) | API Streams e interfaces funcionais | 5 |

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
│   └── ...
├── Lista02/  (mesma organização)
├── ...
├── Lista07/
│   ├── README.md
│   ├── Exercicio01/
│   │   ├── Main.java
│   │   ├── Veiculo.java
│   │   ├── Carro.java
│   │   └── Moto.java
│   └── ...
├── Lista08/  (classes separadas por arquivo)
├── Lista09/  (classes e interfaces separadas por arquivo)
├── Lista10/  (tratamento de exceções)
└── Lista12/  (API Streams e interfaces funcionais)
```

O pacote identifica a lista e o exercício. Por exemplo, `Lista01.Exercicio01` corresponde à pasta `Lista01/Exercicio01`. Isso permite que cada programa tenha uma classe chamada `Main` sem conflito com os demais.

Nas listas 07 a 10 e na Lista12, cada classe ou interface fica em seu próprio arquivo Java para facilitar o estudo das relações entre os tipos.

## Como executar

É necessário ter o **JDK** instalado e os comandos `java` e `javac` disponíveis no terminal. Os exercícios usam apenas a biblioteca padrão do Java. Para a Lista12, use JDK 17 ou superior, pois algumas soluções utilizam `Stream.toList()`.

1. Baixe o repositório ou faça o clone:

   ```sh
   git clone https://github.com/pedroxsst/3POB---FAETERJ.git
   cd 3POB---FAETERJ
   ```

2. Na raiz do repositório, compile o exercício desejado. Para os exercícios com apenas um arquivo:

   ```sh
   javac -encoding UTF-8 Lista01/Exercicio01/Main.java
   ```

   Para os exercícios com classes separadas:

   ```sh
   javac -encoding UTF-8 Lista07/Exercicio01/*.java
   ```

3. Execute usando o nome completo do pacote e da classe:

   ```sh
   java -cp . Lista01.Exercicio01.Main
   ```

   Para o exemplo da Lista07:

   ```sh
   java -cp . Lista07.Exercicio01.Main
   ```

Para escolher outro programa, ajuste a lista e o exercício nos comandos.

Também é possível abrir a raiz do repositório em uma IDE com suporte a Java e executar o método main do exercício escolhido.

## Notas de estudo

- Os enunciados ou resumos estão nos comentários dos arquivos `Main.java`.
- Alguns exercícios recebem dados pelo teclado; outros usam valores definidos no código. Consulte o README da lista.
- A leitura e a exibição de números decimais seguem a configuração regional do Java.
- Os arquivos `.class` gerados pela compilação são ignorados pelo `.gitignore`.
- As regras de cálculo e aprovação pertencem a cada exercício. Na Lista02, média 7 aprova; na Lista06, o enunciado exige média maior que 7.

