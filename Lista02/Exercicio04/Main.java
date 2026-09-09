package Lista02.Exercicio04;

/*-----------------------------------------------------------------------------
Situação do Aluno (Aprovado, Recuperação ou Reprovado)

Enunciado: Desenvolva um programa que leia duas notas de um aluno, 
calcule a média aritmética e determine a situação acadêmica com base 
nas seguintes regras:

Média maior ou igual a 7.0: Aprovado

Média entre 5.0 (inclusive) e 6.9: Em Recuperação

Média abaixo de 5.0: Reprovado

Conceitos: Estrutura condicional encadeada (if-else if-else) 
e operadores lógicos (&&).
-----------------------------------------------------------------------------*/
import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        double media = (nota1 + nota2) / 2;

    
        if(media >= 7.0)
        {
            System.out.print("Aluno aprovado");
        }
        else if(media >= 5.0 && media < 7.0)
        {
            System.out.print("Aluno em recuperação");
        }
        else
        {
            System.out.print("Aluno reprovado automaticamente");
        }
    input.close();
    }
}
