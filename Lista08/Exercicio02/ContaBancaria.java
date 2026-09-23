package Lista08.Exercicio02;

public class ContaBancaria
{
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular)
    {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria(String numeroConta, String titular, double depositoInicial)
    {
        this(numeroConta, titular);

        if(depositoInicial > 0)
        {
            depositar(depositoInicial);
        }
    }

    public String getNumeroConta()
    {
        return numeroConta;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void depositar(double valor)
    {
        if(valor > 0)
        {
            saldo += valor;
        }
        else
        {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor)
    {
        if(valor <= 0)
        {
            System.out.println("Valor de saque inválido.");
        }
        else if(valor > saldo)
        {
            System.out.println("Saldo insuficiente.");
        }
        else
        {
            saldo -= valor;
        }
    }
}
