package Lista05.Exercicio04;

/*
Exercício 4: Soma por Linhas

Enunciado: Faça um programa que leia uma matriz 4 x 3 de números inteiros. 
Em seguida, calcule a soma dos elementos de cada linha individualmente 
e armazene os resultados em um vetor unidimensional de tamanho 4. 
Ao final, exiba a soma correspondente a cada linha.

Conceitos: Integração entre arrays bidimensionais e unidimensionais, 
reinicialização de acumuladores dentro do laço externo.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int matriz[][] = new int[4][3];
        int soma[] = new int[4];
        Scanner input = new Scanner(System.in);

        System.out.println("Preencha a matriz 4x3 com números inteiros:");
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Digite o valor da linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Calcular a soma de cada linha
        for(int i = 0; i < 4; i++)
        {
            soma[i] = 0;
            for(int j = 0; j < 3; j++)
            {
                soma[i] += matriz[i][j];
            }
        }

        // Exibir os resultados
        System.out.println("Somas das linhas:");
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Linha " + (i + 1) + ": " + soma[i]);
        }
        input.close();
    }
}
