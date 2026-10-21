package Lista11.Exercicio02;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/*
Exercício 2: Ler matrículas de duas turmas, eliminar duplicatas
e mostrar a união e a interseção dos conjuntos.
*/
public class Main
{
    public static void main(String[] args)
    {
        Set<Integer> turmaA = new HashSet<>();
        Set<Integer> turmaB = new HashSet<>();

        try (Scanner input = new Scanner(System.in))
        {
            System.out.print("Quantas matriculas serao informadas para a turma A? ");
            int quantidadeA = input.nextInt();

            if (quantidadeA < 0)
            {
                System.out.println("A quantidade nao pode ser negativa.");
                return;
            }

            for (int i = 0; i < quantidadeA; i++)
            {
                System.out.print("Matricula " + (i + 1) + " da turma A: ");
                turmaA.add(input.nextInt());
            }

            System.out.print("Quantas matriculas serao informadas para a turma B? ");
            int quantidadeB = input.nextInt();

            if (quantidadeB < 0)
            {
                System.out.println("A quantidade nao pode ser negativa.");
                return;
            }

            for (int i = 0; i < quantidadeB; i++)
            {
                System.out.print("Matricula " + (i + 1) + " da turma B: ");
                turmaB.add(input.nextInt());
            }

            // As operações usam cópias para preservar as turmas originais.
            Set<Integer> uniao = new HashSet<>(turmaA);
            uniao.addAll(turmaB);

            Set<Integer> intersecao = new HashSet<>(turmaA);
            intersecao.retainAll(turmaB);

            System.out.println("Turma A sem repeticao: " + turmaA);
            System.out.println("Turma B sem repeticao: " + turmaB);
            System.out.println("Uniao: " + uniao);
            System.out.println("Intersecao: " + intersecao);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Informe apenas numeros inteiros.");
        }
    }
}
