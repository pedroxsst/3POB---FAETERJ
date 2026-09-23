package Lista07.Exercicio01;

public class Carro extends Veiculo
{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas)
    {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}
