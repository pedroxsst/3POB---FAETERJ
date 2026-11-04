package CadastroPessoas.arquivo;

import CadastroPessoas.model.Pessoa;
import CadastroPessoas.model.PessoaCadastro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class PessoaArquivo
{
    private Path arquivo = Path.of("CadastroPessoas", "pessoas.csv");
    private static final String CABECALHO = "id;nome;idade;altura";

    public ArrayList<Pessoa> carregar() throws IOException
    {
        PessoaCadastro cadastro = new PessoaCadastro();

        if (Files.notExists(arquivo))
        {
            return cadastro.listar();
        }

        try (BufferedReader leitor = Files.newBufferedReader(arquivo, StandardCharsets.UTF_8))
        {
            String linha = leitor.readLine();
            if (!CABECALHO.equals(linha))
            {
                throw new IOException("Cabecalho invalido no arquivo pessoas.csv.");
            }

            int numeroLinha = 1;
            while ((linha = leitor.readLine()) != null)
            {
                numeroLinha++;
                String[] campos = linha.split(";", -1);

                if (campos.length != 4)
                {
                    throw new IOException("Formato invalido na linha " + numeroLinha + ".");
                }

                try
                {
                    Pessoa pessoa = new Pessoa(
                            Integer.parseInt(campos[0].trim()),
                            campos[1],
                            Integer.parseInt(campos[2].trim()),
                            Double.parseDouble(campos[3].trim()));
                    cadastro.incluir(pessoa);
                }
                catch (IllegalArgumentException e)
                {
                    throw new IOException("Dados invalidos na linha " + numeroLinha
                            + ": " + e.getMessage(), e);
                }
            }
        }
        return cadastro.listar();
    }

    public void salvar(ArrayList<Pessoa> pessoas) throws IOException
    {
        // Grava primeiro em outro arquivo, preservando o CSV se a escrita falhar.
        Path temporario = Files.createTempFile(arquivo.getParent(), "pessoas-", ".tmp");

        try
        {
            try (BufferedWriter escritor = Files.newBufferedWriter(temporario, StandardCharsets.UTF_8))
            {
                escritor.write(CABECALHO);
                escritor.newLine();

                for (Pessoa pessoa : pessoas)
                {
                    escritor.write(pessoa.getId() + ";" + pessoa.getNome() + ";"
                            + pessoa.getIdade() + ";" + pessoa.getAltura());
                    escritor.newLine();
                }
            }

            Files.move(temporario, arquivo, StandardCopyOption.REPLACE_EXISTING);
        }
        finally
        {
            Files.deleteIfExists(temporario);
        }
    }
}
