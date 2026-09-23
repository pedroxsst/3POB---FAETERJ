package Lista07.Exercicio05;

public class Conta
{
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial)
    {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor)
    {
        if(valor > 0)
        {
            saldo += valor;
        }
    }

    public void sacar(double valor)
    {
        if(valor > 0)
        {
            saldo -= valor;
        }
    }

    public String getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }
}
