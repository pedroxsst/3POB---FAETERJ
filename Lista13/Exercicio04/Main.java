package Lista13.Exercicio04;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/*
Exercício 4: Percorrer a pasta Lista13 e suas subpastas, listar somente
arquivos .java e mostrar o tamanho de cada um e o total em bytes.
*/
public class Main
{
    public static void main(String[] args)
    {
        Path pasta = Path.of("Lista13");

        try (Stream<Path> caminhos = Files.walk(pasta))
        {
            List<Path> arquivosJava = caminhos
                    .filter(Files::isRegularFile)
                    .filter(arquivo -> arquivo.getFileName().toString().endsWith(".java"))
                    .sorted()
                    .toList();

            long totalBytes = 0;

            for (Path arquivo : arquivosJava)
            {
                long tamanho = Files.size(arquivo);
                totalBytes = totalBytes + tamanho;

                System.out.println(pasta.relativize(arquivo) + ": " + tamanho + " bytes");
            }

            System.out.println("Total: " + totalBytes + " bytes");
        }
        catch (IOException | UncheckedIOException e)
        {
            System.out.println("Erro ao percorrer a pasta: " + e.getMessage());
        }
    }
}
