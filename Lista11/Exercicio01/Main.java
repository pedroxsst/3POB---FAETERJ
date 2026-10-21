package Lista11.Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Exercício 1: Ler cinco tarefas, remover uma pelo nome,
consultar se outra existe e mostrar a lista em ordem alfabética.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<String> tarefas = new ArrayList<>();

        try (Scanner input = new Scanner(System.in))
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.print("Digite a tarefa " + (i + 1) + ": ");
                tarefas.add(input.nextLine());
            }

            System.out.print("Digite o nome da tarefa que deseja remover: ");
            String remover = input.nextLine();

            if (tarefas.remove(remover))
            {
                System.out.println("Tarefa removida.");
            }
            else
            {
                System.out.println("Tarefa nao encontrada.");
            }

            System.out.print("Digite o nome da tarefa que deseja consultar: ");
            String consultar = input.nextLine();

            if (tarefas.contains(consultar))
            {
                System.out.println("A tarefa esta na lista.");
            }
            else
            {
                System.out.println("A tarefa nao esta na lista.");
            }

            Collections.sort(tarefas);

            System.out.println("Tarefas em ordem alfabetica:");
            for (String tarefa : tarefas)
            {
                System.out.println(tarefa);
            }
        }
    }
}
