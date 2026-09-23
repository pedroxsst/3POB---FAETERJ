package Lista09.Exercicio01;

import java.text.DecimalFormat;

public class Pix implements MetodoPagamento
{
    private String chavePix;

    public Pix(String chavePix)
    {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor)
    {
        DecimalFormat formato = new DecimalFormat("0.00");

        if(valor > 0)
        {
            System.out.println("Pagamento de R$ " + formato.format(valor) + " realizado por Pix.");
        }
        else
        {
            System.out.println("Valor de pagamento inválido.");
        }
    }

    @Override
    public String obterDetalhes()
    {
        return "Chave Pix: " + chavePix;
    }
}
