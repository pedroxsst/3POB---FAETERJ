package Lista09.Exercicio04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
Exercício 4: Conta bancária com taxação abstrata.
Executar a cobrança mensal obrigatória em diferentes tipos de conta.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        contas.add(new ContaCorrente("001", 1000));
        contas.add(new ContaEmpresarial("002", 5000));

        DecimalFormat formato = new DecimalFormat("0.00");

        for(ContaBancaria conta : contas)
        {
            conta.cobrarTaxaMensal();
            System.out.println("Conta " + conta.getNumero() + ": R$ " + formato.format(conta.consultarSaldo()));
        }
    }
}
