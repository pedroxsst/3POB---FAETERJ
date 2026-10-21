package Lista11.Exercicio03;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
Exercício 3: Ler uma frase e contar a frequência de cada palavra.
As palavras são separadas por espaços e convertidas para minúsculas.
*/
public class Main
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            System.out.print("Digite uma frase: ");
            String texto = input.nextLine().trim().toLowerCase(Locale.ROOT);

            if (texto.isEmpty())
            {
                System.out.println("Nenhuma palavra foi informada.");
                return;
            }

            String[] palavras = texto.split("\\s+");
            Map<String, Integer> frequencias = new HashMap<>();

            for (String palavra : palavras)
            {
                int quantidade = frequencias.getOrDefault(palavra, 0);
                frequencias.put(palavra, quantidade + 1);
            }

            System.out.println("Frequencia das palavras:");
            for (Map.Entry<String, Integer> item : frequencias.entrySet())
            {
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }
    }
}
