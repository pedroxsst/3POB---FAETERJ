package Lista10.Exercicio05;

/*
Exercício 5: Encadear exceções no processamento simulado de arquivos.
Exibir a mensagem principal e a causa original das falhas.
*/
public class Main
{
    public static void main(String[] args)
    {
        ServicoDados servico = new ServicoDados();
        String[] caminhos = {"dados.txt", null, "", "dados_invalidos.txt"};

        for(String caminho : caminhos)
        {
            try
            {
                servico.processarArquivo(caminho);
            }
            catch(ProcessamentoDadosException e)
            {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Causa original: " + e.getCause().getMessage());
            }
        }
    }
}
