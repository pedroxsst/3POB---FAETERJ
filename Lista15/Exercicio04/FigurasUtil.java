package Lista15.Exercicio04;

import java.util.List;

public class FigurasUtil {
    public static double somarAreas(List<? extends Figura> listaFiguras) {
        double total = 0;
        for (Figura figura : listaFiguras) {
            total += figura.calcularArea();
        }

        // Producer Extends: podemos ler Figura, mas nao adicionar nova Figura.
        // listaFiguras.add(new Quadrado(2)); // Erro de compilacao.
        return total;
    }
}
