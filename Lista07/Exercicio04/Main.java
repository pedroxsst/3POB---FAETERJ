package Lista07.Exercicio04;

import java.text.DecimalFormat;

/*
Exercício 4: Formas geométricas.
Calcular as áreas de figuras diferentes em um único laço polimórfico.
*/
public class Main
{
    public static void main(String[] args)
    {
        FiguraGeometrica figuras[] = {
            new Quadrado(5),
            new Retangulo(6, 4),
            new Circulo(3)
        };

        DecimalFormat formato = new DecimalFormat("0.00");

        for(FiguraGeometrica figura : figuras)
        {
            System.out.println(figura.getClass().getSimpleName() + " - Área: " + formato.format(figura.calcularArea()));
        }
    }
}
