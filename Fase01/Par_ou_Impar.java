/*-----------------------------------------------------------------------------
Escreva um programa em Java que leia um número inteiro e informe 
se ele é par ou ímpar.

Conceitos: Operador módulo (%) e estrutura if-else simples.
-----------------------------------------------------------------------------*/

import java.util.Scanner;

public class Par_ou_Impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }

        input.close();
    }
}