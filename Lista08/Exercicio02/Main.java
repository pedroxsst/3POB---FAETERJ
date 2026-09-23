package Lista08.Exercicio02;

import java.text.DecimalFormat;

/*
Exercício 2: Conta bancária com saldo protegido.
Alterar o saldo somente pelas operações de depósito e saque.
*/
public class Main
{
    public static void main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria("12345", "Pedro", 1000);
        DecimalFormat formato = new DecimalFormat("0.00");

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + formato.format(conta.getSaldo()));
    }
}
