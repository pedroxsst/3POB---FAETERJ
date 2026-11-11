package Lista14.Exercicio04;

public class Pedido {
    private final int id;
    private final double subtotal;
    private double frete;

    public Pedido(int id, double subtotal) {
        this.id = id;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getFrete() {
        return frete;
    }

    public void adicionarFrete(double frete) {
        this.frete = frete;
    }

    public double getTotal() {
        return subtotal + frete;
    }
}
