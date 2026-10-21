package Lista13.Exercicio01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Exercício 1: Criar o diretório dados/relatorios e escrever sumario.txt.
O relatório anterior deve ser substituído a cada execução.
*/
public class Main
{
    public static void main(String[] args)
    {
        Path diretorio = Path.of("Lista13", "Exercicio01", "dados", "relatorios");
        Path arquivo = diretorio.resolve("sumario.txt");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String relatorio = "RELATORIO DE EXECUCAO\n"
                + "Data e hora: " + LocalDateTime.now().format(formato) + "\n"
                + "Sistema: exercicios de arquivos em Java\n"
                + "Status: execucao concluida\n";

        try
        {
            if (!Files.exists(diretorio))
            {
                Files.createDirectories(diretorio);
            }

            Files.writeString(arquivo, relatorio, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado em: " + arquivo);
        }
        catch (IOException e)
        {
            System.out.println("Erro ao gravar o relatorio: " + e.getMessage());
        }
    }
}
