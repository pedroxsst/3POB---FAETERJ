package CadastroPessoas.view;

import CadastroPessoas.model.Pessoa;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaView
{
    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");

    public boolean temEntrada()
    {
        return entrada.hasNextLine();
    }

    public void exibirMenu()
    {
        System.out.println();
        System.out.println("CADASTRO DE PESSOAS");
        System.out.println("1 - Incluir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar");
        System.out.println("0 - Sair");
        System.out.print("Opcao: ");
    }

    public int lerInteiro(String mensagem)
    {
        System.out.print(mensagem);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    public Pessoa lerPessoa(int id)
    {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        int idade = lerInteiro("Idade: ");
        System.out.print("Altura em metros: ");
        double altura = Double.parseDouble(entrada.nextLine().trim().replace(',', '.'));
        return new Pessoa(id, nome, idade, altura);
    }

    public void listar(ArrayList<Pessoa> pessoas)
    {
        if (pessoas.isEmpty())
        {
            mostrarMensagem("Nenhuma pessoa cadastrada.");
            return;
        }

        for (Pessoa pessoa : pessoas)
        {
            System.out.println("ID: " + pessoa.getId() + " | Nome: " + pessoa.getNome()
                    + " | Idade: " + pessoa.getIdade()
                    + " | Altura: " + df.format(pessoa.getAltura()) + " m");
        }
    }

    public void mostrarMensagem(String mensagem)
    {
        System.out.println(mensagem);
    }

    public void fechar()
    {
        entrada.close();
    }
}
