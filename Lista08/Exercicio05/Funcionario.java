package Lista08.Exercicio05;

import java.text.DecimalFormat;

public class Funcionario
{
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double novoSalario)
    {
        if(novoSalario > salario)
        {
            salario = novoSalario;
        }
        else
        {
            System.out.println("Erro: o novo salário deve ser maior que o salário atual.");
        }
    }

    public void exibirDados()
    {
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: R$ " + formato.format(salario));
    }
}
