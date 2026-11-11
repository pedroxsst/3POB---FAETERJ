package Lista14.Exercicio05;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<Double> cotacaoPassagens = CompletableFuture.supplyAsync(() -> {
            aguardar(1200);
            return 1250.00;
        });

        CompletableFuture<Double> cotacaoHospedagem = CompletableFuture.supplyAsync(() -> {
            aguardar(800);
            return 650.00;
        });

        CompletableFuture<PacoteViagem> resultado = cotacaoPassagens
                .thenCombine(cotacaoHospedagem, PacoteViagem::new)
                .exceptionally(erro -> {
                    System.err.println("Falha ao consultar os precos: " + erro.getMessage());
                    return null;
                });

        System.out.println("Consultando passagens e hospedagem em paralelo...");
        PacoteViagem pacote = resultado.join();

        if (pacote != null) {
            System.out.printf(Locale.forLanguageTag("pt-BR"),
                    "Passagens: R$ %.2f | Hospedagem: R$ %.2f | Total: R$ %.2f%n",
                    pacote.getPassagem(), pacote.getHospedagem(), pacote.getTotal());
        }
    }

    private static void aguardar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Cotacao interrompida.", e);
        }
    }
}
