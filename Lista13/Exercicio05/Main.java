package Lista13.Exercicio05;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/*
Exercício 5: Ler clientes_bruto.txt, limpar espaços, remover linhas vazias
e gravar os nomes em caixa alta no arquivo clientes_padronizado.txt.
*/
public class Main
{
    public static void main(String[] args)
    {
        Path pasta = Path.of("Lista13", "Exercicio05");
        Path entrada = pasta.resolve("clientes_bruto.txt");
        Path saida = pasta.resolve("clientes_padronizado.txt");
        Path temporario = null;

        try (Stream<String> linhas = Files.lines(entrada, StandardCharsets.UTF_8))
        {
            List<String> nomes = linhas
                    .map(String::trim)
                    .filter(nome -> !nome.isBlank())
                    .map(nome -> nome.toUpperCase(Locale.ROOT))
                    .toList();

            // Grava primeiro no temporário para não deixar a saída pela metade.
            temporario = Files.createTempFile(pasta, "clientes_", ".tmp");
            Files.write(temporario, nomes, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            Files.move(temporario, saida, StandardCopyOption.ATOMIC_MOVE,
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Clientes gravados: " + nomes.size());
            System.out.println("Arquivo criado em: " + saida);
        }
        catch (AtomicMoveNotSupportedException e)
        {
            System.out.println("O sistema de arquivos nao permite substituicao atomica.");
        }
        catch (IOException | UncheckedIOException e)
        {
            System.out.println("Erro ao processar os clientes: " + e.getMessage());
        }
        finally
        {
            if (temporario != null)
            {
                try
                {
                    Files.deleteIfExists(temporario);
                }
                catch (IOException e)
                {
                    System.out.println("Nao foi possivel remover o temporario: " + e.getMessage());
                }
            }
        }
    }
}
