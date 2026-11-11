package Lista14.Exercicio01;

public class ContadorRegressivo implements Runnable {
    @Override
    public void run() {
        for (int numero = 10; numero >= 1; numero--) {
            System.out.println("Regressivo: " + numero);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
