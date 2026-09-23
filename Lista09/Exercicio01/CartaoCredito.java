package Lista09.Exercicio01;

import java.text.DecimalFormat;

public class CartaoCredito implements MetodoPagamento
{
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite)
    {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor)
    {
        DecimalFormat formato = new DecimalFormat("0.00");

        if(valor > 0 && valor <= limite)
        {
            limite -= valor;
            System.out.println("Pagamento de R$ " + formato.format(valor) + " aprovado no cartão.");
        }
        else
        {
            System.out.println("Pagamento não autorizado.");
        }
    }

    @Override
    public String obterDetalhes()
    {
        return "Cartão de crédito: " + numeroCartao;
    }
}
