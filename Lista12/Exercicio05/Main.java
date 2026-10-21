package Lista12.Exercicio05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
Exercício 5: Filtrar funcionários de TI, projetar um reajuste de 10%
e imprimir os valores usando Predicate, Function e Consumer.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Pedro", "TI", 3000),
                new Funcionario("Ana", "RH", 2800),
                new Funcionario("Carlos", "TI", 4000),
                new Funcionario("Beatriz", "Financeiro", 3500));

        DecimalFormat df = new DecimalFormat("0.00");

        Predicate<Funcionario> trabalhaEmTI =
                funcionario -> funcionario.getDepartamento().equals("TI");

        Function<Funcionario, Double> calcularReajuste =
                funcionario -> funcionario.getSalario() * 1.10;

        Consumer<Double> imprimirSalario =
                salario -> System.out.println("Salario projetado: R$ " + df.format(salario));

        funcionarios.stream()
                .filter(trabalhaEmTI)
                .map(calcularReajuste)
                .forEach(imprimirSalario);
    }
}
