package Lista10.Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exercício 1: Divisão segura com múltiplos catch e finally.
Ler dois inteiros, tratar divisão por zero e entrada não numérica.
*/
public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        try
        {
            System.out.print("Digite o primeiro número inteiro: ");
            int primeiro = entrada.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int segundo = entrada.nextInt();

            int resultado = primeiro / segundo;
            System.out.println("Resultado da divisão inteira: " + resultado);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Erro: não é possível dividir por zero.");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Erro: informe somente números inteiros.");
        }
        finally
        {
            entrada.close();
            System.out.println("Operação finalizada.");
        }
    }
}
