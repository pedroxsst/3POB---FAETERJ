package Lista03;
/*
Exercício 5: Cálculo do Fatorial de um Número (for ou while)

Enunciado: Crie um programa que receba um número inteiro 
não negativo N e calcule o seu fatorial N!

Conceitos: Variável acumuladora de produto (inicializada em 1),
controle de laço decrescente/crescente e tipo de dado numérico
para evitar overflow (long).
*/

import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero, fatorial = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = input.nextInt();

        if(numero < 0)
        {
            System.out.println("Número inválido. Por favor, digite um número maior ou igual a zero.");
        }
        else
        {
            for(int i = numero; i >= 1; i--)
            {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        input.close();
    }
}