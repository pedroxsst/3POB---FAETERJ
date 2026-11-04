package CadastroPessoas.controller;

import CadastroPessoas.arquivo.PessoaArquivo;
import CadastroPessoas.model.Pessoa;
import CadastroPessoas.model.PessoaCadastro;
import CadastroPessoas.view.PessoaView;
import java.io.IOException;
import java.util.NoSuchElementException;

public class PessoaController
{
    private PessoaCadastro cadastro = new PessoaCadastro();
    private PessoaArquivo arquivo = new PessoaArquivo();
    private PessoaView view = new PessoaView();

    public void iniciar()
    {
        try
        {
            cadastro = new PessoaCadastro(arquivo.carregar());
        }
        catch (IOException e)
        {
            view.mostrarMensagem("Nao foi possivel carregar o cadastro: " + e.getMessage());
            view.fechar();
            return;
        }

        boolean continuar = true;
        while (continuar)
        {
            view.exibirMenu();
            if (!view.temEntrada())
            {
                break;
            }

            try
            {
                int opcao = view.lerInteiro("");
                switch (opcao)
                {
                    case 1:
                        incluir();
                        break;
                    case 2:
                        alterar();
                        break;
                    case 3:
                        excluir();
                        break;
                    case 4:
                        view.listar(cadastro.listar());
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        view.mostrarMensagem("Opcao invalida.");
                }
            }
            catch (NumberFormatException e)
            {
                view.mostrarMensagem("Numero invalido. Digite um numero no formato solicitado.");
            }
            catch (IllegalArgumentException e)
            {
                view.mostrarMensagem(e.getMessage());
            }
            catch (IOException e)
            {
                view.mostrarMensagem("Nao foi possivel salvar. A operacao nao foi concluida: "
                        + e.getMessage());
            }
            catch (NoSuchElementException e)
            {
                continuar = false;
            }
        }

        view.mostrarMensagem("Programa encerrado.");
        view.fechar();
    }

    private void incluir() throws IOException
    {
        int id = view.lerInteiro("ID: ");
        if (cadastro.buscar(id) != null)
        {
            throw new IllegalArgumentException("Ja existe uma pessoa com esse ID.");
        }

        Pessoa pessoa = view.lerPessoa(id);
        PessoaCadastro atualizado = new PessoaCadastro(cadastro.listar());
        atualizado.incluir(pessoa);
        salvar(atualizado);
        view.mostrarMensagem("Pessoa incluida com sucesso.");
    }

    private void alterar() throws IOException
    {
        int id = view.lerInteiro("ID da pessoa: ");
        if (cadastro.buscar(id) == null)
        {
            throw new IllegalArgumentException("Pessoa nao encontrada.");
        }

        Pessoa pessoa = view.lerPessoa(id);
        PessoaCadastro atualizado = new PessoaCadastro(cadastro.listar());
        atualizado.alterar(pessoa);
        salvar(atualizado);
        view.mostrarMensagem("Pessoa alterada com sucesso.");
    }

    private void excluir() throws IOException
    {
        int id = view.lerInteiro("ID da pessoa: ");
        PessoaCadastro atualizado = new PessoaCadastro(cadastro.listar());
        atualizado.excluir(id);
        salvar(atualizado);
        view.mostrarMensagem("Pessoa excluida com sucesso.");
    }

    private void salvar(PessoaCadastro atualizado) throws IOException
    {
        arquivo.salvar(atualizado.listar());
        // Atualiza a memoria somente depois de salvar o arquivo.
        cadastro = atualizado;
    }
}
