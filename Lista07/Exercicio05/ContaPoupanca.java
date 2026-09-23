package Lista07.Exercicio05;

public class ContaPoupanca extends Conta
{
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldoInicial, double taxaRendimento)
    {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento()
    {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }

    @Override
    public void sacar(double valor)
    {
        if(valor > 0 && valor <= getSaldo())
        {
            super.sacar(valor);
        }
        else
        {
            System.out.println("Saldo insuficiente.");
        }
    }
}
