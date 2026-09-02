/*
Exercício 5: Separação em Vetores de Pares e Ímpares

Enunciado: Crie um programa que leia 10 números inteiros 
e os armazene em um vetor original. Em seguida, distribua 
os valores em dois novos vetores: um contendo apenas os números pares
e outro contendo apenas os ímpares. Ao final, exiba os elementos 
de cada um dos novos vetores.

Conceitos: Controle de índices independentes para múltiplos vetores, 
operador módulo (%) e dimensionamento dinâmico ou estático de 
arrays auxiliares.
*/

import java.util.Scanner;

public class vet_par_impar 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int contPar = 0;
        int contImpar = 0;
        int auxPar = 0;
        int auxImpar = 0;

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = input.nextInt();
            if(vetor[i] % 2 == 0)
                contPar++;
            else
                contImpar++;
        }

        int[] vetPar = new int[contPar];
        int[] vetImpar = new int[contImpar];

        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] % 2 == 0)
            {
                vetPar[auxPar] = vetor[i];
                auxPar++;
            }
            else
            {
                vetImpar[auxImpar] = vetor[i];
                auxImpar++;
            }

        }

        System.out.print("Ímpares:");
        for(int i = 0; i < vetImpar.length; i++)
        {
            System.out.print(" " + vetImpar[i]);
        }
        System.out.println();

        System.out.print("Pares:");
        for(int i = 0; i < vetPar.length; i++)
        {
            System.out.print(" " + vetPar[i]);
        }
        System.out.println();

        input.close();
    }
}
