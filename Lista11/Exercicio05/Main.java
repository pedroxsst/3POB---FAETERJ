package Lista11.Exercicio05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Exercício 5: Criar uma lista de produtos e agrupá-los por categoria
em um mapa, com uma lista de produtos para cada categoria.
*/
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", "Informática", 80));
        produtos.add(new Produto("Arroz", "Alimentos", 25));
        produtos.add(new Produto("Java Basico", "Livros", 60));
        produtos.add(new Produto("Teclado", "Informática", 150));
        produtos.add(new Produto("Feijao", "Alimentos", 9));
        produtos.add(new Produto("Logica de Programacao", "Livros", 45));

        HashMap<String, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto produto : produtos)
        {
            String categoria = produto.getCategoria();

            if (!produtosPorCategoria.containsKey(categoria))
            {
                produtosPorCategoria.put(categoria, new ArrayList<>());
            }

            produtosPorCategoria.get(categoria).add(produto);
        }

        DecimalFormat df = new DecimalFormat("0.00");

        for (Map.Entry<String, List<Produto>> grupo : produtosPorCategoria.entrySet())
        {
            System.out.println("Categoria: " + grupo.getKey());

            for (Produto produto : grupo.getValue())
            {
                System.out.println("  " + produto.getNome() + " - R$ " + df.format(produto.getPreco()));
            }

            System.out.println();
        }
    }
}
