/*
Exercício 4: Busca Linear de Elemento

Enunciado: Faça um programa que leia um vetor de 6 números inteiros. 
Em seguida, solicite ao usuário um número de busca ($X$). 
O programa deve informar se $X$ está presente no vetor e, caso esteja, 
exibir a primeira posição (índice) onde ele foi encontrado. 
Se não estiver presente, exibir uma mensagem indicando ausência.

Conceitos: Algoritmo de busca sequencial, uso de flag booleana
(boolean encontrado) e interrupção de repetição com break.
*/
import java.util.Scanner;

public class busca_linear 
{
    public static void main(String[] args)
    {
        int[] vetor = {10, 20, 30, 40, 50, 60};
        int x;
        boolean encontrado = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de busca (X): ");
        x = input.nextInt();

        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == x)
            {
                System.out.println("Número encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado)
        {
            System.out.println("Número não encontrado.");
        }
        input.close();
    }
}
