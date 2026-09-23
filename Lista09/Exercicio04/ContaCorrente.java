package Lista09.Exercicio04;

public class ContaCorrente extends ContaBancaria
{
    public ContaCorrente(String numero, double saldoInicial)
    {
        super(numero, saldoInicial);
    }

    @Override
    public void cobrarTaxaMensal()
    {
        debitar(15.00);
    }
}
