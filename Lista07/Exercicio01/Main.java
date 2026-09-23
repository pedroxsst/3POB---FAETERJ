package Lista07.Exercicio01;

/*
Exercício 1: Hierarquia de veículos.
Usar herança, super e sobrescrita para exibir os detalhes de carro e moto.
*/
public class Main
{
    public static void main(String[] args)
    {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB 500", 500);

        System.out.println("CARRO");
        carro.exibirDetalhes();

        System.out.println();
        System.out.println("MOTO");
        moto.exibirDetalhes();
    }
}
