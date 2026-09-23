package Lista09.Exercicio04;

public abstract class ContaBancaria
{
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldoInicial)
    {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero()
    {
        return numero;
    }

    public void depositar(double valor)
    {
        if(valor > 0)
        {
            saldo += valor;
        }
    }

    public double consultarSaldo()
    {
        return saldo;
    }

    protected void debitar(double valor)
    {
        if(valor > 0)
        {
            saldo -= valor;
        }
    }

    public abstract void cobrarTaxaMensal();
}
