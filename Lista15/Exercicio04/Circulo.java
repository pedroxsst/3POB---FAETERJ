package Lista15.Exercicio04;

public class Circulo extends Figura {
    private final double raio;

    public Circulo(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio nao pode ser negativo.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
