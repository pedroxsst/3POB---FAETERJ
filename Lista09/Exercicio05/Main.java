package Lista09.Exercicio05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
Exercício 5: Classe abstrata junto com interface.
Calcular o imposto somente dos itens que implementam Tributavel.
*/
public class Main
{
    public static double calcularTotalImpostos(List<Tributavel> itensTributaveis)
    {
        double total = 0;

        for(Tributavel item : itensTributaveis)
        {
            total += item.calcularTributo();
        }

        return total;
    }

    public static void main(String[] args)
    {
        Eletronico celular = new Eletronico(1, 2000);
        Eletronico notebook = new Eletronico(2, 4000);
        Alimento arroz = new Alimento(3, 30);

        List<Item> itens = new ArrayList<Item>();
        itens.add(celular);
        itens.add(notebook);
        itens.add(arroz);

        List<Tributavel> itensTributaveis = new ArrayList<Tributavel>();

        for(Item item : itens)
        {
            if(item instanceof Tributavel)
            {
                itensTributaveis.add((Tributavel) item);
            }
        }

        DecimalFormat formato = new DecimalFormat("0.00");
        double total = calcularTotalImpostos(itensTributaveis);
        System.out.println("Total de impostos: R$ " + formato.format(total));
    }
}
