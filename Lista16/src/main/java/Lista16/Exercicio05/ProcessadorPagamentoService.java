package Lista16.Exercicio05;

import java.util.Objects;

public class ProcessadorPagamentoService {
    private final GatewayPagamento gateway;
    private final PedidoRepository pedidoRepository;

    public ProcessadorPagamentoService(GatewayPagamento gateway, PedidoRepository pedidoRepository) {
        this.gateway = Objects.requireNonNull(gateway);
        this.pedidoRepository = Objects.requireNonNull(pedidoRepository);
    }

    public void processar(Pedido pedido) {
        Objects.requireNonNull(pedido);
        gateway.cobrar(pedido.getValor());
        pedido.setStatus(StatusPedido.PAGO);
        pedidoRepository.atualizar(pedido);
    }
}
