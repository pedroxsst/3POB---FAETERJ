package CadastroPessoas.model;

public class Pessoa
{
    private int id;
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(int id, String nome, int idade, double altura)
    {
        if (id <= 0)
        {
            throw new IllegalArgumentException("O ID deve ser maior que zero.");
        }

        if (nome == null || nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("O nome nao pode ficar vazio.");
        }

        if (nome.contains(";") || nome.contains("\n") || nome.contains("\r"))
        {
            throw new IllegalArgumentException("O nome nao pode conter ponto e virgula ou quebra de linha.");
        }

        if (idade < 0)
        {
            throw new IllegalArgumentException("A idade nao pode ser negativa.");
        }

        if (altura <= 0 || !Double.isFinite(altura))
        {
            throw new IllegalArgumentException("A altura deve ser um numero positivo e finito.");
        }

        this.id = id;
        this.nome = nome.trim();
        this.idade = idade;
        this.altura = altura;
    }

    public int getId()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public double getAltura()
    {
        return altura;
    }
}
