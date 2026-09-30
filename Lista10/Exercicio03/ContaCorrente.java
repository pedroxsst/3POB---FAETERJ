package Lista10.Exercicio03;

public class ContaCorrente
{
    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldoInicial)
    {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero()
    {
        return numero;
    }

    public double consultarSaldo()
    {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException
    {
        if(valor > saldo)
        {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta " + numero
                    + ". Saldo disponível: " + saldo + ". Saque solicitado: " + valor);
        }

        saldo -= valor;
    }
}
