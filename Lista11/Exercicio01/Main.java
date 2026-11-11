package Lista11.Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite a tarefa " + (i + 1) + ": ");
                tarefas.add(input.nextLine());
            }

            System.out.println("Tarefas cadastradas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + " - " + tarefas.get(i));
            }

            System.out.print("Remover por (1) indice ou (2) nome? ");
            String opcao = input.nextLine().trim();

            if (opcao.equals("1")) {
                System.out.print("Informe o numero da tarefa a remover: ");
                try {
                    int indice = Integer.parseInt(input.nextLine().trim()) - 1;
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Indice fora da lista.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Indice invalido.");
                }
            } else if (opcao.equals("2")) {
                System.out.print("Digite o nome da tarefa a remover: ");
                if (tarefas.remove(input.nextLine())) {
                    System.out.println("Tarefa removida.");
                } else {
                    System.out.println("Tarefa nao encontrada.");
                }
            } else {
                System.out.println("Opcao invalida; nenhuma tarefa removida.");
            }

            System.out.print("Digite o nome da tarefa que deseja consultar: ");
            String consultar = input.nextLine();
            if (tarefas.contains(consultar)) {
                System.out.println("A tarefa esta na lista.");
            } else {
                System.out.println("A tarefa nao esta na lista.");
            }

            Collections.sort(tarefas);
            System.out.println("Tarefas em ordem alfabetica:");
            for (String tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}
