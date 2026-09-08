package Lista01.Lista02;
/*
O Maior de Três Números

Enunciado: Faça um programa que receba três números inteiros
distintos e determine qual deles é o maior.

Conceitos: Comparações compostas com operadores relacionais 
e lógicos.
*/

import java.util.Scanner;

public class MaiorNumero
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.println("O maior número é: " + num1);
            }
            else
            {
                System.out.println("O maior número é: " + num3);
            }
        }
        else
        {
            if(num2 > num3)
            {
                System.out.println("O maior número é: " + num2);
            }
            else
            {
                System.out.println("O maior número é: " + num3);
            }
        }
    input.close();
    }
}