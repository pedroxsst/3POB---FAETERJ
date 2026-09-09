package Lista01.Exercicio03;

/*-----------------------------------------------------------------------------
Conversor de Temperatura (Celsius para Fahrenheit)

Enunciado: Crie um programa que solicite uma temperatura em graus Celsius ($C$) e a converta para Fahrenheit (F) utilizando a fórmula:
F = (C * 1.8) + 32 

Conceitos: Operações aritméticas com precedência de parênteses e 
formatação de saída.

Exemplo de Entrada: 25.0  Saída esperada: 77
-----------------------------------------------------------------------------*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double c = input.nextDouble();
        DecimalFormat df = new DecimalFormat("0.##");

        double fahrenheit = (c * 1.8) + 32;

        System.out.println("A temperatura em Farenheit: "+ df.format(fahrenheit));
        input.close();
    }
}
