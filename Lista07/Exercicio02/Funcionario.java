package Lista07.Exercicio02;

public class Funcionario
{
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario()
    {
        return salarioBase;
    }

    public String getNome()
    {
        return nome;
    }
}
