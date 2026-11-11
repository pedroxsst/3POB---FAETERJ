package Lista14.Exercicio01;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread crescente = new Thread(new ContadorCrescente(), "Crescente");
        Thread regressivo = new Thread(new ContadorRegressivo(), "Regressivo");

        crescente.start();
        regressivo.start();

        crescente.join();
        regressivo.join();

        System.out.println("Contagens finalizadas!");
    }
}
