package Lista15.Exercicio03;

public class Main {
    public static void main(String[] args) {
        CalculadoraEstatistica<Integer> inteiros = new CalculadoraEstatistica<>();
        inteiros.adicionar(10);
        inteiros.adicionar(20);
        inteiros.adicionar(30);

        CalculadoraEstatistica<Double> decimais = new CalculadoraEstatistica<>();
        decimais.adicionar(1.5);
        decimais.adicionar(4.0);
        decimais.adicionar(2.5);

        System.out.println("Media dos inteiros: " + inteiros.calcularMedia());
        System.out.println("Maior inteiro: " + inteiros.calcularMaior());
        System.out.println("Media dos decimais: " + decimais.calcularMedia());
        System.out.println("Maior decimal: " + decimais.calcularMaior());

        // Nao compila: String nao estende Number.
        // CalculadoraEstatistica<String> textos = new CalculadoraEstatistica<>();
    }
}
