package Lista14.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProcessadorPagamentoServiceTest {
    @Mock
    private GatewayPagamento gateway;

    @Mock
    private PedidoRepository pedidoRepository;

    @InjectMocks
    private ProcessadorPagamentoService service;

    private Pedido pedido;

    @BeforeEach
    void prepararPedido() {
        pedido = new Pedido(99.90);
    }

    @Test
    void deveMarcarPedidoPagoEAtualizarRepositorio() {
        service.processar(pedido);

        assertEquals(StatusPedido.PAGO, pedido.getStatus());
        verify(gateway).cobrar(99.90);
        verify(pedidoRepository).atualizar(pedido);
    }

    @Test
    void naoDeveAtualizarRepositorioSePagamentoFalhar() {
        doThrow(new PagamentoRecusadoException())
            .when(gateway).cobrar(anyDouble());

        assertThrows(PagamentoRecusadoException.class, () -> service.processar(pedido));

        assertEquals(StatusPedido.PENDENTE, pedido.getStatus());
        verify(pedidoRepository, never()).atualizar(any());
    }
}
