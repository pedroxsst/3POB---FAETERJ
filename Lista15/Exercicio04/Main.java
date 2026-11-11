package Lista15.Exercicio04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Quadrado> quadrados = Arrays.asList(new Quadrado(2), new Quadrado(3));
        List<Circulo> circulos = Arrays.asList(new Circulo(1), new Circulo(2));
        List<Figura> figuras = Arrays.asList(new Quadrado(4), new Circulo(1));

        System.out.println("Area dos quadrados: " + FigurasUtil.somarAreas(quadrados));
        System.out.println("Area dos circulos: " + FigurasUtil.somarAreas(circulos));
        System.out.println("Area das figuras mistas: " + FigurasUtil.somarAreas(figuras));
    }
}
