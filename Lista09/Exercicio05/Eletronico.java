package Lista09.Exercicio05;

public class Eletronico extends Item implements Tributavel
{
    public Eletronico(int codigo, double precoBase)
    {
        super(codigo, precoBase);
    }

    @Override
    public double calcularTributo()
    {
        return precoBase * 0.15;
    }
}
