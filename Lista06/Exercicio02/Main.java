package Lista06.Exercicio02;

/*
Exercício 2: Área e perímetro de um círculo.
Ler o raio e exibir os resultados com duas casas decimais.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Circulo
{
    double raio;

    double calcularArea()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    double calcularPerimetro()
    {
        return 2 * Math.PI * raio;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Circulo circulo = new Circulo();

        System.out.print("Digite o raio: ");
        circulo.raio = input.nextDouble();

        System.out.println("Area: " + df.format(circulo.calcularArea()));
        System.out.println("Perimetro: " + df.format(circulo.calcularPerimetro()));

        input.close();
    }
}
