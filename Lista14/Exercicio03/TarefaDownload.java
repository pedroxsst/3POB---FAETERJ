package Lista14.Exercicio03;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class TarefaDownload implements Callable<String> {
    private final int id;

    public TarefaDownload(int id) {
        this.id = id;
    }

    @Override
    public String call() throws InterruptedException {
        long atraso = ThreadLocalRandom.current().nextLong(500, 1501);
        Thread.sleep(atraso);
        return "Arquivo " + id + " processado pela thread: "
                + Thread.currentThread().getName();
    }
}
