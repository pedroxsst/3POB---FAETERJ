package Lista09.Exercicio04;

public class ContaEmpresarial extends ContaBancaria
{
    public ContaEmpresarial(String numero, double saldoInicial)
    {
        super(numero, saldoInicial);
    }

    @Override
    public void cobrarTaxaMensal()
    {
        double taxa = 30.00 + consultarSaldo() * 0.005;
        debitar(taxa);
    }
}
