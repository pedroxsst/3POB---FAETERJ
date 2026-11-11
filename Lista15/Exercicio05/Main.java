package Lista15.Exercicio05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> origem = Arrays.asList(10, 20, 30);
        List<Number> destinoNumeros = new ArrayList<>();
        List<Object> destinoObjetos = new ArrayList<>();

        ColecoesUtil.copiarElementos(origem, destinoNumeros);
        ColecoesUtil.copiarElementos(origem, destinoObjetos);

        System.out.println("Origem (Integer): " + origem);
        System.out.println("Destino (Number): " + destinoNumeros);
        System.out.println("Destino (Object): " + destinoObjetos);
    }
}
