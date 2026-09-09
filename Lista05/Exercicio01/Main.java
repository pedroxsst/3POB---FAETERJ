package Lista05.Exercicio01;

/*
Enunciado: Crie um programa em Java que declare e preencha uma 
matriz de inteiros 3 x 3 com valores fornecidos pelo usuário. 
Ao final, exiba a matriz formatada em formato de grade (linhas e colunas).

Conceitos: Declaração e instanciação de arrays bidimensionais (int[][]), 
laços aninhados (for dentro de for) e formatação de saída (print vs println).
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int matriz[][] = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Preencha a matriz 3x3 com números inteiros:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Digite o valor da linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Matriz preenchida:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
            input.close();
    }
}
