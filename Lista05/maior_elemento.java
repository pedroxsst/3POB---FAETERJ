/*
Exercício 3: Maior Elemento e sua Localização (Linha e Coluna)

Enunciado: Escreva um programa que leia uma matriz 3 x 4 de números inteiros. 
O programa deve identificar o maior valor presente na matriz e informar 
exatamente a linha e a coluna onde ele se encontra.

Conceitos: Rastreamento de múltiplos índices de posição 
(linhaMaior, colunaMaior)e busca linear bidimensional.
*/
import java.util.Scanner;

public class maior_elemento {
    public static void main(String[] args)
    {
        int matriz[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print("Digite o valor da linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                matriz[i][j] = input.nextInt();
                if(matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("O maior elemento é " + maior + " e está na linha " + (linhaMaior + 1) + ", coluna " + (colunaMaior + 1));
        input.close();
    }
}
