package Lista03.Exercicio03;

/*-----------------------------------------------------------------------------
Exercício 3: Validação de Entrada com Senha (do-while ou while)

Enunciado: Desenvolva um programa que simule a autenticação de uma 
senha numérica (ex: 2026). O programa deve solicitar a senha 
repetidamente até que o usuário informe o valor correto. 
Para cada tentativa errada, exiba "Senha Incorreta! Tente novamente.". 
Quando correta, exiba "Acesso Permitido!".

Conceitos: Validação de entradas de usuário, condição booleana de 
continuidade e controle de fluxo.

-----------------------------------------------------------------------------*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int senhaCorreta = 2026;

        while (true)
        {
            System.out.print("Digite sua senha: ");
            int senha = input.nextInt();

            if (senha == senhaCorreta)
            {
                System.out.println("Acesso Permitido!");
                break;
            }
            else
            {
                System.out.println("Senha Incorreta! Tente novamente.");
            }
        }

        input.close();
    }
}
