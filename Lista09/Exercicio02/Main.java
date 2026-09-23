package Lista09.Exercicio02;

import java.text.DecimalFormat;

/*
Exercício 2: Hierarquia de formas com classe abstrata.
Obrigar cada forma concreta a implementar o cálculo da área.
*/
public class Main
{
    public static void main(String[] args)
    {
        Forma formas[] = {
            new Retangulo("Azul", 5, 3),
            new Circulo("Vermelho", 4)
        };

        DecimalFormat formato = new DecimalFormat("0.00");

        for(Forma forma : formas)
        {
            forma.exibirCor();
            System.out.println("Área: " + formato.format(forma.calcularArea()));
            System.out.println();
        }
    }
}
