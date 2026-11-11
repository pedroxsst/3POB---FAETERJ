package Lista15.Exercicio04;

public class Quadrado extends Figura {
    private final double lado;

    public Quadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado nao pode ser negativo.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
