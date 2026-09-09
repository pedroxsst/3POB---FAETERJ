package Lista06.Exercicio03;

/*
Exercício 3: Conta bancária.
Testar depósitos e saques com valores válidos e inválidos.
*/

import java.text.DecimalFormat;

class ContaBancaria
{
    String titular;
    String numeroConta;
    double saldo = 0;

    void depositar(double valor)
    {
        if (valor > 0)
        {
            saldo = saldo + valor;
        }
        else
        {
            System.out.println("Valor de deposito invalido");
        }
    }

    void sacar(double valor)
    {
        if (valor > 0 && saldo >= valor)
        {
            saldo = saldo - valor;
        }
        else
        {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    void consultarSaldo()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Saldo: R$ " + df.format(saldo));
    }
}

public class Main
{
    public static void main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Pedro";
        conta.numeroConta = "12345";

        conta.consultarSaldo(); // 0

        conta.depositar(200);
        conta.consultarSaldo(); // 200

        conta.sacar(50);
        conta.consultarSaldo(); // 150

        conta.depositar(-10); // Invalido
        conta.depositar(0);   // Invalido
        conta.sacar(300);     // Saldo insuficiente
        conta.sacar(-20);     // Invalido
        conta.sacar(0);       // Invalido

        conta.consultarSaldo(); // Continua em 150
    }
}
