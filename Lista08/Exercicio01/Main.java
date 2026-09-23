package Lista08.Exercicio01;

import java.text.DecimalFormat;

/*
Exercício 1: Produto com sobrecarga de construtores.
Validar preço e estoque e calcular o valor total armazenado.
*/
public class Main
{
    public static void main(String[] args)
    {
        Produto produtoA = new Produto("Notebook", 3500, 5);
        Produto produtoB = new Produto("Mouse", 100);
        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("Estoque do produto A: R$ " + formato.format(produtoA.calcularValorTotalEmEstoque()));
        System.out.println("Estoque do produto B: R$ " + formato.format(produtoB.calcularValorTotalEmEstoque()));

        produtoA.setPreco(-10);
        System.out.println("Preço atual do produto A: R$ " + formato.format(produtoA.getPreco()));
    }
}
