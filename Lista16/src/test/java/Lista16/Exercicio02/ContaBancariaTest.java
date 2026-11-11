package Lista16.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaBancariaTest {
    private ContaBancaria conta;

    @BeforeEach
    void prepararConta() {
        conta = new ContaBancaria(100.0);
    }

    @Test
    void deveDepositar() {
        conta.depositar(50.0);
        assertEquals(150.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveSacar() {
        conta.sacar(40.0);
        assertEquals(60.0, conta.getSaldo(), 0.001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -10.0})
    void deveRejeitarSaqueInvalido(double valor) {
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(valor));
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveInformarSaldoInsuficiente() {
        SaldoInsuficienteException erro = assertThrows(
            SaldoInsuficienteException.class, () -> conta.sacar(150.0));
        assertEquals("Saldo insuficiente para realizar o saque.", erro.getMessage());
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveRejeitarDepositoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(-1.0));
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }
}
