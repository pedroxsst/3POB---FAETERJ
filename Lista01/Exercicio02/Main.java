package Lista01.Exercicio02;

/*-----------------------------------------------------------------------------
Área e Perímetro de um Retângulo

Enunciado: Faça um programa que leia a base e a altura de um retângulo.
Em seguida, calcule e mostre:
- A área (base * altura)
- O perímetro (2  * (base + altura))

Conceitos: Atribuição de múltiplas saídas a partir dos mesmos dados de entrada.

Exemplo de Entrada: Base: 5.0, Altura: 3.0 Saída esperada: 
- Área: 15.0
- Perímetro: 16.0
-----------------------------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Digite a base do retângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = input.nextDouble();

        double area = base * altura;
        double perimetro = (base *2) + (altura*2);

        System.out.println("A area do retangulo: "+ df.format(area));
        System.out.println("O perimetro do retangulo: "+ df.format(perimetro));

        input.close();
    }
}
