package Lista09.Exercicio05;

public abstract class Item
{
    private int codigo;
    protected double precoBase;

    public Item(int codigo, double precoBase)
    {
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public double getPrecoBase()
    {
        return precoBase;
    }
}
