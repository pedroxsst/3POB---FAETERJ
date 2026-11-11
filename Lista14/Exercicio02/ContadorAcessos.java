package Lista14.Exercicio02;

import java.util.concurrent.atomic.AtomicInteger;

public class ContadorAcessos {
    private int contadorSemSincronizacao;
    private final AtomicInteger contadorAtomico = new AtomicInteger();

    public void incrementarSemSincronizacao() {
        int valorAtual = contadorSemSincronizacao;
        Thread.yield(); // Facilita a observacao da condicao de corrida.
        contadorSemSincronizacao = valorAtual + 1;
    }

    public void incrementarComAtomicInteger() {
        contadorAtomico.incrementAndGet();
    }

    public int getContadorSemSincronizacao() {
        return contadorSemSincronizacao;
    }

    public int getContadorAtomico() {
        return contadorAtomico.get();
    }
}
