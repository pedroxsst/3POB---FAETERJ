package Lista14.Exercicio02;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (!Double.isFinite(saldoInicial) || saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido.");
        }
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        validarValor(valor);
        saldo += valor;
    }

    public void sacar(double valor) {
        validarValor(valor);
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    private void validarValor(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }
}
