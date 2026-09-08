package Lista01.Lista02;
/*
Validador de Maioridade

Enunciado: Crie um programa que leia o ano de nascimento de uma
pessoa e o ano atual. Calcule a idade e exiba se ela já é maior 
de idade (18 anos ou mais) ou menor de idade.

Conceitos: Operadores relacionais (>=) e subtração básica 
combinada com decisão.
*/

import java.util.Scanner;

public class Maioridade
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int ano = input.nextInt();

        int idade = 2026 - ano;

        if (idade < 18)
        {
            System.out.print("É menor de idade!");
        }
        else
        {
            System.out.print("É maior de idade");
        }
        input.close();
    }
}