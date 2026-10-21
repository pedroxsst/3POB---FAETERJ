package Lista12.Exercicio04;

import java.util.Arrays;
import java.util.List;

/*
Exercício 4: Criar uma interface funcional e passar diferentes regras
para processar uma lista: inverter, colocar entre colchetes e usar caixa alta.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<String> textos = Arrays.asList("java", "streams", "lambda");

        List<String> invertidos = processarLista(textos,
                texto -> new StringBuilder(texto).reverse().toString());

        List<String> comColchetes = processarLista(textos,
                texto -> "[" + texto + "]");

        List<String> maiusculos = processarLista(textos, String::toUpperCase);

        System.out.println("Invertidos: " + invertidos);
        System.out.println("Entre colchetes: " + comColchetes);
        System.out.println("Maiusculos: " + maiusculos);
    }

    public static List<String> processarLista(List<String> lista, TransformadorTexto regra)
    {
        return lista.stream()
                .map(regra::transformar)
                .toList();
    }
}
