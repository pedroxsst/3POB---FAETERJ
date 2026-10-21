package Lista13.Exercicio03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.List;

/*
Exercício 3: Ler produtos.csv, pular o cabeçalho e calcular os totais.
O formato é Nome,Quantidade,PrecoUnitario, com ponto nos preços decimais.
*/
public class Main
{
    public static void main(String[] args)
    {
        Path arquivo = Path.of("Lista13", "Exercicio03", "produtos.csv");
        DecimalFormat df = new DecimalFormat("0.00");

        try
        {
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);

            if (linhas.isEmpty())
            {
                System.out.println("O CSV esta vazio.");
                return;
            }

            double totalGeral = 0;

            // Começa em 1 para pular o cabeçalho.
            for (int i = 1; i < linhas.size(); i++)
            {
                String[] campos = linhas.get(i).split(",", -1);

                if (campos.length != 3 || campos[0].trim().isEmpty())
                {
                    System.out.println("Formato invalido na linha " + (i + 1)
                            + ". Use Nome,Quantidade,PrecoUnitario.");
                    return;
                }

                try
                {
                    String nome = campos[0].trim();
                    int quantidade = Integer.parseInt(campos[1].trim());
                    double preco = Double.parseDouble(campos[2].trim());

                    if (quantidade < 0 || preco < 0 || !Double.isFinite(preco))
                    {
                        throw new NumberFormatException("Valores negativos ou nao finitos.");
                    }

                    double totalItem = quantidade * preco;

                    if (!Double.isFinite(totalItem) || !Double.isFinite(totalGeral + totalItem))
                    {
                        throw new NumberFormatException("Total acima do limite numerico.");
                    }

                    totalGeral = totalGeral + totalItem;
                    System.out.println(nome + ": R$ " + df.format(totalItem));
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Numero invalido na linha " + (i + 1)
                            + ". Verifique a quantidade e o preco.");
                    return;
                }
            }

            System.out.println("Total do inventario: R$ " + df.format(totalGeral));
        }
        catch (IOException e)
        {
            System.out.println("Erro ao ler o CSV: " + e.getMessage());
        }
    }
}
