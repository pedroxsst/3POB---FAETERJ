package Lista11.Exercicio02;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
Exercício 2: Calcular o total, a média e o produto mais caro de uma
lista de seis produtos usando Streams, sem laços for ou while.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500),
                new Produto("Mouse", 80),
                new Produto("Teclado", 150),
                new Produto("Monitor", 900),
                new Produto("Headset", 250),
                new Produto("Webcam", 120));

        DecimalFormat df = new DecimalFormat("0.00");

        double total = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        OptionalDouble media = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .average();

        Optional<Produto> maisCaro = produtos.stream()
                .max(Comparator.comparingDouble(Produto::getPreco));

        System.out.println("Valor total: R$ " + df.format(total));
        System.out.println("Preco medio: R$ " + df.format(media.orElse(0)));

        maisCaro.ifPresent(produto -> System.out.println(
                "Produto mais caro: " + produto.getNome()
                + " - R$ " + df.format(produto.getPreco())));
    }
}
