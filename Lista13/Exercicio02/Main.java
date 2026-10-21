package Lista13.Exercicio02;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/*
Exercício 2: Ler servidor.log, selecionar as linhas [ERROR],
remover o prefixo e mostrar as mensagens e a quantidade de erros.
*/
public class Main
{
    public static void main(String[] args)
    {
        Path arquivo = Path.of("Lista13", "Exercicio02", "servidor.log");
        String prefixo = "[ERROR] ";

        try (Stream<String> linhas = Files.lines(arquivo, StandardCharsets.UTF_8))
        {
            List<String> erros = linhas
                    .filter(linha -> linha.startsWith(prefixo))
                    .map(linha -> linha.substring(prefixo.length()))
                    .toList();

            System.out.println("Total de erros: " + erros.size());
            erros.forEach(System.out::println);
        }
        catch (IOException | UncheckedIOException e)
        {
            System.out.println("Erro ao ler o log: " + e.getMessage());
        }
    }
}
