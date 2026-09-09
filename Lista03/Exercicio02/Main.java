package Lista03.Exercicio02;

/*-----------------------------------------------------------------------------
Exercício 2: Somatório e Média até Flag de Parada (while)

Enunciado: Crie um programa que leia continuamente números inteiros 
positivos fornecidos pelo usuário. A leitura deve ser encerrada  
imediatamente quando o usuário digitar um número negativo (flag de parada).  
Ao final, o programa deve exibir a quantidade de números digitados,  
a soma total e a média aritmética deles (desconsiderando o valor negativo).

Conceitos: Laço com condição de parada indeterminada (while),  
acumulador de valores e contador de iterações.

-----------------------------------------------------------------------------*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;
        double media;

        System.out.print("Digite um número inteiro positivo(negativo sai do loop):");
        numero = input.nextInt();

        if( numero < 0)
        {
            System.out.println("Nenhum número positivo foi digitado.");
            input.close();
            return;
        }
        while(numero >= 0)
        {
            soma += numero;
            contador++;

            System.out.print("Digite um número inteiro positivo(negativo sai do loop):");
            numero = input.nextInt();
        }
        media = (double)soma / contador;
        System.out.println("Soma: " + soma + " média: " + media + " qtd numeros: " + contador);
        input.close();
    }
}
