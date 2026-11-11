package Lista14.Exercicio01;

public class ContadorCrescente implements Runnable {
    @Override
    public void run() {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Crescente: " + numero);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
