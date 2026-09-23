package Lista08.Exercicio05;

/*
Exercício 5: Funcionário com regra de negócio no setter.
Permitir somente aumentos de salário.
*/
public class Main
{
    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario("Pedro", "2026001", 3000);

        funcionario.exibirDados();

        System.out.println();
        System.out.println("Tentando reduzir salário...");
        funcionario.setSalario(2500);

        System.out.println();
        System.out.println("Aplicando aumento...");
        funcionario.setSalario(3500);

        System.out.println();
        funcionario.exibirDados();
    }
}
