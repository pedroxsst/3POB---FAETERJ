/*
Exercício 1: Armazenamento e Leitura Inversa

Enunciado: Escreva um programa em Java que declare um array de inteiros de tamanho 5,
leia os 5 valores informados pelo usuário e, em seguida, exiba todos os elementos na 
ordem inversa à que foram digitados.

Conceitos: Declaração e instanciação de vetores, manipulação de índices e iteração decrescente (i--).
*/

import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um numero inteiro: ");
            vetor[i] = input.nextInt();
        }

        for(int i = vetor.length - 1; i >= 0; i--)
        {
            System.out.print(vetor[i] + " ");
        }
        input.close();
        
    }
}