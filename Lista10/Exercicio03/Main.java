package Lista10.Exercicio03;

import java.text.DecimalFormat;

/*
Exercício 3: Exceção verificada para saque superior ao saldo.
Demonstrar um saque válido e outro com saldo insuficiente.
*/
public class Main
{
    public static void main(String[] args)
    {
        ContaCorrente conta = new ContaCorrente("001", 500);
        double[] saques = {200, 400};
        DecimalFormat formato = new DecimalFormat("0.00");

        for(double valor : saques)
        {
            try
            {
                conta.sacar(valor);
                System.out.println("Saque realizado: R$ " + formato.format(valor));
            }
            catch(SaldoInsuficienteException e)
            {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Saldo da conta " + conta.getNumero() + ": R$ "
                    + formato.format(conta.consultarSaldo()));
        }
    }
}
