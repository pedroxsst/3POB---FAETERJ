package Lista10.Exercicio04;

public class Eleitor
{
    private String nome;
    private int idade;

    public void cadastrar(String nome, int idade)
    {
        if(idade < 0 || idade > 130)
        {
            throw new IdadeInvalidaException("Idade inválida: " + idade
                    + ". A idade deve estar entre 0 e 130 anos.");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }
}
