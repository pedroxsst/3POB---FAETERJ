package Lista14.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ContadorAcessos contador = new ContadorAcessos();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    contador.incrementarSemSincronizacao();
                    contador.incrementarComAtomicInteger();
                }
            }, "Acesso-" + (i + 1));

            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Sem sincronizacao: " + contador.getContadorSemSincronizacao());
        System.out.println("Com AtomicInteger: " + contador.getContadorAtomico());

        if (contador.getContadorAtomico() != 5000) {
            throw new AssertionError("O contador atomico deveria atingir 5000 acessos.");
        }
    }
}
