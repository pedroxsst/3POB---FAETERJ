package Lista07.Exercicio02;

import java.text.DecimalFormat;

/*
Exercício 2: Folha de pagamento polimórfica.
Calcular os salários de funcionários, gerente e vendedor pelo mesmo vetor.
*/
public class Main
{
    public static void main(String[] args)
    {
        Funcionario funcionarios[] = {
            new Funcionario("Pedro", 2000),
            new Gerente("Maria", 5000, 1500),
            new Vendedor("Joao", 2500, 20000, 0.05)
        };

        DecimalFormat formato = new DecimalFormat("0.00");
        double folhaTotal = 0;

        for(Funcionario funcionario : funcionarios)
        {
            double salario = funcionario.calcularSalario();
            System.out.println(funcionario.getNome() + ": R$ " + formato.format(salario));
            folhaTotal += salario;
        }

        System.out.println("Folha total: R$ " + formato.format(folhaTotal));
    }
}
