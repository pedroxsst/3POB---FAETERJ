package Lista08.Exercicio01;

public class Produto
{
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque)
    {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String nome, double preco)
    {
        this(nome, preco, 0);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        if(preco >= 0)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque()
    {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque)
    {
        if(quantidadeEstoque >= 0)
        {
            this.quantidadeEstoque = quantidadeEstoque;
        }
        else
        {
            System.out.println("Quantidade em estoque não pode ser negativa.");
        }
    }

    public double calcularValorTotalEmEstoque()
    {
        return preco * quantidadeEstoque;
    }
}
