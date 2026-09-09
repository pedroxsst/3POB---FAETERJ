package Lista04.Exercicio03;

/*
Exercício 3: Média da Turma e Alunos Acima da Média

Enunciado: Desenvolva um programa que armazene as notas finais de 8 alunos
em um vetor do tipo double. Calcule a média aritmética da turma e, 
em um segundo laço, exiba quais notas ficaram estritamente acima da média
calculada.

Conceitos: Múltiplas passagens pelo mesmo vetor, cálculo acumulador e 
filtragem condicional de elementos.

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double notas[] = new double[8];
        double soma = 0;

        for(int i = 0; i < notas.length; i++)
        {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;

        System.out.println("A média da turma é: " + media);
        for(int i = 0; i < notas.length; i++)
        {
            if(notas[i] > media)
            {
                System.out.println("O aluno " + (i + 1) + " ficou acima da média com a nota " + notas[i]);
            }
        }
        input.close();
    }
}
