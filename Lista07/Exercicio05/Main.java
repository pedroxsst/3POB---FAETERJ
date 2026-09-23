package Lista07.Exercicio05;

import java.text.DecimalFormat;

/*
Exercício 5: Contas bancárias.
Aplicar regras diferentes de rendimento, taxa e limite de saque.
*/
public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat formato = new DecimalFormat("0.00");

        ContaPoupanca poupanca = new ContaPoupanca("001", 1000, 0.01);
        poupanca.aplicarRendimento();
        poupanca.sacar(200);
        System.out.println("Saldo poupança: R$ " + formato.format(poupanca.getSaldo()));

        ContaCorrente corrente = new ContaCorrente("002", 500, 300);
        corrente.sacar(600);
        System.out.println("Saldo corrente: R$ " + formato.format(corrente.getSaldo()));
    }
}
