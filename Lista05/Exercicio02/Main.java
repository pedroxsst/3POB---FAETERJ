package Lista05.Exercicio02;

/*
Exercício 2: Soma dos Elementos da Diagonal Principal

Enunciado: Desenvolva um programa que leia uma matriz quadrada 
de ordem 4 (4 x 4) de números reais (double). O programa deve 
calcular e exibir a soma de todos os elementos que pertencem 
à diagonal principal 
(onde o índice da linha é igual ao índice da coluna: i == j).

Conceitos: Matrizes quadradas, identificação geométrica de índices 
e otimização de iteração (laço único vs laços aninhados).
*/
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        double[][] matriz = {
        {1.0, 2.0, 3.0, 4.0},
        {5.0, 6.0, 7.0, 8.0},
        {9.0, 10.0, 11.0, 12.0},
        {13.0, 14.0, 15.0, 16.0}
        };
        Scanner input = new Scanner(System.in);
        double soma = 0;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
                {
                    if(i == j)
                    {
                        soma += matriz[i][j];
                        break;
                    }
                }
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + soma);
        input.close();  
    }  
}
