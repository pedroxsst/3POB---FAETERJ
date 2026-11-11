package Lista14.Exercicio04;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Void> checkout = CompletableFuture
                .supplyAsync(() -> {
                    aguardar(1000);
                    System.out.println("Pedido consultado com sucesso.");
                    return new Pedido(101, 120.00);
                })
                .thenApply(pedido -> {
                    double frete = pedido.getSubtotal() >= 100 ? 15.00 : 25.00;
                    pedido.adicionarFrete(frete);
                    return pedido;
                })
                .thenAccept(pedido -> {
                    System.out.println("Confirmacao por e-mail enviada (simulacao).");
                    System.out.printf(Locale.forLanguageTag("pt-BR"),
                            "Pedido %d - Frete: R$ %.2f - Total: R$ %.2f%n",
                            pedido.getId(), pedido.getFrete(), pedido.getTotal());
                });

        System.out.println("A thread principal continua outras atividades...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Atividade principal " + i);
            Thread.sleep(150);
        }

        checkout.join();
    }

    private static void aguardar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Consulta do pedido interrompida.", e);
        }
    }
}
