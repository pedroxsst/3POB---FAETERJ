package Lista07.Exercicio05;

public class ContaCorrente extends Conta
{
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial)
    {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor)
    {
        double taxa = 2.00;
        double valorTotal = valor + taxa;

        if(valor <= 0)
        {
            System.out.println("Valor inválido.");
        }
        else if(getSaldo() - valorTotal >= -limiteChequeEspecial)
        {
            super.sacar(valorTotal);
        }
        else
        {
            System.out.println("Limite insuficiente.");
        }
    }
}
