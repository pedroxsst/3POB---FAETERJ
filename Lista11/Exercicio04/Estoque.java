package Lista11.Exercicio04;

import java.util.HashMap;
import java.util.Map;

public class Estoque
{
    private Map<String, Integer> produtos = new HashMap<>();

    public boolean existeProduto(String codigo)
    {
        return produtos.containsKey(codigo);
    }

    public void inserirProduto(String codigo, int quantidade)
    {
        if (existeProduto(codigo))
        {
            System.out.println("O produto " + codigo + " ja esta cadastrado.");
            return;
        }

        if (quantidade < 0)
        {
            System.out.println("A quantidade inicial nao pode ser negativa.");
            return;
        }

        produtos.put(codigo, quantidade);
    }

    public void atualizarQuantidade(String codigo, int alteracao)
    {
        if (!existeProduto(codigo))
        {
            System.out.println("Produto " + codigo + " nao encontrado.");
            return;
        }

        int novaQuantidade = produtos.get(codigo) + alteracao;

        if (novaQuantidade < 0)
        {
            System.out.println("Atualizacao invalida: quantidade fora do limite permitido.");
            return;
        }

        produtos.put(codigo, novaQuantidade);
    }

    public void exibirEstoqueBaixo(int limite)
    {
        System.out.println("Produtos com estoque zerado ou abaixo de " + limite + ":");

        for (Map.Entry<String, Integer> item : produtos.entrySet())
        {
            if (item.getValue() == 0 || item.getValue() < limite)
            {
                System.out.println(item.getKey() + ": " + item.getValue() + " unidades");
            }
        }
    }
}
