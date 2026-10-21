package Lista11.Exercicio01;

import java.util.Arrays;
import java.util.List;

/*
Exercício 1: Filtrar nomes que começam com A, ignorando maiúsculas e
minúsculas, transformar em caixa alta e ordenar em uma nova lista.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<String> nomes = Arrays.asList(
                "ana", "Carlos", "beatriz", "Antonio", "AMANDA", "bernardo");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.toUpperCase().startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Nomes filtrados: " + resultado);
    }
}
