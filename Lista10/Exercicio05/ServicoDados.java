package Lista10.Exercicio05;

import java.io.IOException;

public class ServicoDados
{
    public void processarArquivo(String caminho) throws ProcessamentoDadosException
    {
        try
        {
            if(caminho == null || caminho.trim().isEmpty())
            {
                throw new IOException("O caminho do arquivo não foi informado.");
            }

            // Simula o conteúdo do arquivo, sem acessar o sistema de arquivos.
            String conteudo = "42";
            if(caminho.equals("dados_invalidos.txt"))
            {
                conteudo = "abc";
            }

            int numero = Integer.parseInt(conteudo);
            System.out.println("Arquivo processado. Valor lido: " + numero);
        }
        catch(IOException | NumberFormatException e)
        {
            // Mantém a exceção original como causa da exceção de processamento.
            throw new ProcessamentoDadosException("Não foi possível processar o arquivo: "
                    + caminho, e);
        }
    }
}
