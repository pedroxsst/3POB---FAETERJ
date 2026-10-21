package Lista11.Exercicio04;

/*
Exercício 4: Inserir produtos, atualizar quantidades, verificar códigos
e exibir produtos com estoque zerado ou abaixo de cinco unidades.
*/
public class Main
{
    public static void main(String[] args)
    {
        Estoque estoque = new Estoque();

        estoque.inserirProduto("P001", 10);
        estoque.inserirProduto("P002", 2);
        estoque.inserirProduto("P003", 0);
        estoque.inserirProduto("P004", 5);

        estoque.atualizarQuantidade("P001", -7);
        estoque.atualizarQuantidade("P002", 4);

        System.out.println("P001 esta cadastrado? " + estoque.existeProduto("P001"));
        System.out.println("P999 esta cadastrado? " + estoque.existeProduto("P999"));

        estoque.atualizarQuantidade("P999", 3);
        estoque.atualizarQuantidade("P003", -1);

        estoque.exibirEstoqueBaixo(5);
    }
}
