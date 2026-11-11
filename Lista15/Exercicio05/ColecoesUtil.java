package Lista15.Exercicio05;

import java.util.List;

public class ColecoesUtil {
    public static <T> void copiarElementos(List<? extends T> origem, List<? super T> destino) {
        for (T elemento : origem) {
            destino.add(elemento);
        }
        // PECS: a origem produz elementos T (extends) e o destino consome T (super).
    }
}
