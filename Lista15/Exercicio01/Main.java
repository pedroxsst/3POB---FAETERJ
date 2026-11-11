package Lista15.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Caixa<Integer> caixaNumero = new Caixa<>();
        Caixa<String> caixaTexto = new Caixa<>();
        Caixa<Produto> caixaProduto = new Caixa<>();

        System.out.println("Caixa de numero vazia? " + caixaNumero.isVazia());
        caixaNumero.guardar(42);
        caixaTexto.guardar("Programacao Java");
        caixaProduto.guardar(new Produto("Teclado"));

        Integer numero = caixaNumero.recuperar();
        String texto = caixaTexto.recuperar();
        Produto produto = caixaProduto.recuperar();

        System.out.println("Numero: " + numero);
        System.out.println("Texto: " + texto);
        System.out.println("Produto: " + produto);

        caixaNumero.limpar();
        System.out.println("Caixa de numero vazia apos limpar? " + caixaNumero.isVazia());
    }
}
