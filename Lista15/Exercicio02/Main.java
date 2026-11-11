package Lista15.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Par<Integer, String> par1 = new Par<>(1, "Ativo");
        Par<Integer, String> par2 = new Par<>(1, "Ativo");
        Par<Integer, String> par3 = new Par<>(2, "Inativo");

        System.out.println(par1);
        System.out.println("Chave: " + par1.getChave());
        System.out.println("Valor: " + par1.getValor());
        System.out.println("par1 e par2 iguais? " + Par.saoIguais(par1, par2));
        System.out.println("par1 e par3 iguais? " + Par.saoIguais(par1, par3));
    }
}
