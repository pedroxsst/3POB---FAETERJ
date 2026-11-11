package Lista14.Exercicio05;

import java.util.Objects;

public class Pedido {
    private final double valor;
    private StatusPedido status;

    public Pedido(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        this.valor = valor;
        this.status = StatusPedido.PENDENTE;
    }

    public double getValor() {
        return valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = Objects.requireNonNull(status);
    }
}
