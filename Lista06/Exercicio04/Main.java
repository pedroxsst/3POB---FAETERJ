package Lista06.Exercicio04;

/*
Exercício 4: Salário de um funcionário.
Aplicar um aumento de 10% e calcular o salário líquido com desconto fixo.
*/

import java.text.DecimalFormat;

class Funcionario
{
    String nome;
    String cargo;
    double salarioBruto;

    void aplicarAumento(double porcentagem)
    {
        salarioBruto = salarioBruto + (salarioBruto * porcentagem / 100);
    }

    double calcularSalarioLiquido(double descontoImposto)
    {
        return salarioBruto - descontoImposto;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pedro";
        funcionario.cargo = "Assistente";
        funcionario.salarioBruto = 2000;

        System.out.println("Salario antes: R$ " + df.format(funcionario.salarioBruto));

        funcionario.aplicarAumento(10);

        System.out.println("Salario apos aumento: R$ " + df.format(funcionario.salarioBruto));

        double liquido = funcionario.calcularSalarioLiquido(200);

        System.out.println("Salario liquido: R$ " + df.format(liquido));
    }
}
