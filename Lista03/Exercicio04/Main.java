package Lista03.Exercicio04;

/*-----------------------------------------------------------------------------
Exercício 4: Contagem de Números Pares e Ímpares em um Intervalo (for)

Enunciado: Faça um programa que leia dois valores inteiros que 
representam os limites de um intervalo fechado [A, B] (onde A <= B). 
O programa deve iterar por todos os números desse intervalo e exibir:

- A quantidade de números pares.
- A quantidade de números ímpares.

Conceitos: Estrutura de repetição for combinada com decisão 
condicional (if/else) e operador módulo (%).

-----------------------------------------------------------------------------*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int par = 0;
        int impar = 0;

        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        int inicio = Math.min(n1, n2);
        int fim = Math.max(n1, n2);

        for(int i = inicio; i <= fim; i++)
        {
            if(i % 2 == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        input.close();
    }
}
