package Lista09.Exercicio01;

/*
Exercício 1: Meios de pagamento com interface.
Finalizar compras usando cartão de crédito ou Pix pelo mesmo contrato.
*/
public class Main
{
    public static void finalizarCompra(MetodoPagamento metodo, double total)
    {
        System.out.println(metodo.obterDetalhes());
        metodo.processarPagamento(total);
        System.out.println();
    }

    public static void main(String[] args)
    {
        MetodoPagamento cartao = new CartaoCredito("1234 5678 9012 3456", 2000);
        MetodoPagamento pix = new Pix("pedro@email.com");

        finalizarCompra(cartao, 750);
        finalizarCompra(pix, 120);
    }
}
