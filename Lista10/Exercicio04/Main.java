package Lista10.Exercicio04;

/*
Exercício 4: Validar idade com uma exceção não verificada.
Testar idades válidas, os limites e valores fora do intervalo de 0 a 130.
*/
public class Main
{
    public static void main(String[] args)
    {
        String[] nomes = {"Pedro", "Ana", "Carlos", "Maria", "João"};
        int[] idades = {20, 0, 130, -1, 131};

        for(int i = 0; i < nomes.length; i++)
        {
            Eleitor eleitor = new Eleitor();

            try
            {
                eleitor.cadastrar(nomes[i], idades[i]);
                System.out.println("Eleitor cadastrado: " + eleitor.getNome()
                        + ", idade: " + eleitor.getIdade());
            }
            catch(IdadeInvalidaException e)
            {
                System.out.println("Erro ao cadastrar " + nomes[i] + ": " + e.getMessage());
            }
        }
    }
}
