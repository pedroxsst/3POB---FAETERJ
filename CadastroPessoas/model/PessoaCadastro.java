package CadastroPessoas.model;

import java.util.ArrayList;

public final class PessoaCadastro
{
    private ArrayList<Pessoa> pessoas;

    public PessoaCadastro()
    {
        pessoas = new ArrayList<>();
    }

    public PessoaCadastro(ArrayList<Pessoa> pessoas)
    {
        this();
        for (Pessoa pessoa : pessoas)
        {
            incluir(pessoa);
        }
    }

    public Pessoa buscar(int id)
    {
        for (Pessoa pessoa : pessoas)
        {
            if (pessoa.getId() == id)
            {
                return pessoa;
            }
        }
        return null;
    }

    public void incluir(Pessoa pessoa)
    {
        if (buscar(pessoa.getId()) != null)
        {
            throw new IllegalArgumentException("Ja existe uma pessoa com esse ID.");
        }
        pessoas.add(pessoa);
    }

    public void alterar(Pessoa pessoa)
    {
        for (int i = 0; i < pessoas.size(); i++)
        {
            if (pessoas.get(i).getId() == pessoa.getId())
            {
                pessoas.set(i, pessoa);
                return;
            }
        }
        throw new IllegalArgumentException("Pessoa nao encontrada.");
    }

    public void excluir(int id)
    {
        Pessoa pessoa = buscar(id);
        if (pessoa == null)
        {
            throw new IllegalArgumentException("Pessoa nao encontrada.");
        }
        pessoas.remove(pessoa);
    }

    public ArrayList<Pessoa> listar()
    {
        return new ArrayList<>(pessoas);
    }
}
