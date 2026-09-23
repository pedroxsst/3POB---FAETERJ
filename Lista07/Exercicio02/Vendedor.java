package Lista07.Exercicio02;

public class Vendedor extends Funcionario
{
    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual)
    {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario()
    {
        return salarioBase + totalVendas * comissaoPercentual;
    }
}
