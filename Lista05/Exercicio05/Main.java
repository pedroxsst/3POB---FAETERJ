package Lista05.Exercicio05;

/*Exercício 5: Matriz Transposta

Enunciado: Crie um programa que leia uma matriz A de dimensão 2 x 3 
de números inteiros. Em seguida, construa e exiba a sua matriz transposta A^ 
de dimensão 3 x 2 (onde o elemento da posição [i][j] em A passa a ocupar 
a posição [j][i] em A^).

Conceitos: Manipulação e inversão de dimensões (linhas viram colunas), 
instanciação de matrizes complementares.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        int transposta[][] = new int[3][2];
        Scanner input = new Scanner(System.in);

        //preenche a matriz
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        //preenche a transposta
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz original:");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
