package Lista10.Exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exercício 2: Acessar um vetor de Strings e converter o valor para inteiro.
Tratar índice inexistente e falha de conversão numérica.
*/
public class Main
{
    public static void main(String[] args)
    {
        String[] valores = {"10", "25", "abc", "50"};
        Scanner entrada = new Scanner(System.in);

        try
        {
            System.out.print("Digite um índice de 0 a 3: ");
            int indice = entrada.nextInt();

            int numero = Integer.parseInt(valores[indice]);
            System.out.println("Valor convertido: " + numero);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Erro: índice inexistente. Use um índice de 0 a 3.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: o valor dessa posição não é um número inteiro válido.");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Erro: o índice deve ser um número inteiro.");
        }
        finally
        {
            entrada.close();
        }
    }
}
