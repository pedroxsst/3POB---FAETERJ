package Lista01.Exercicio04;

/*-----------------------------------------------------------------------------
Cálculo de Salário com Desconto do INSS

Enunciado: Desenvolva um programa que receba o valor da hora de trabalho 
de um funcionário e a quantidade de horas trabalhadas no mês. O programa 
deve calcular o salário bruto, descontar uma taxa fixa de 10% referente ao 
INSS e exibir o salário líquido final.

Conceitos: Multiplicação, cálculo percentual e variáveis intermediárias.

Exemplo de Entrada: Valor da hora: 50.00, Horas: 160  Saída esperada:
Salário Bruto: R$ 8000.00, Salário Líquido: R$ 7200.00

-----------------------------------------------------------------------------*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite a carga horária mensal: ");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double salarioLiquido = salarioBruto * 0.90;

        System.out.println("O Salario liquido: R$ " + df.format(salarioLiquido));
        input.close();
    }
}
