package Lista08.Exercicio03;

public class Retangulo
{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura)
    {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura()
    {
        return largura;
    }

    public void setLargura(double largura)
    {
        if(largura > 0)
        {
            this.largura = largura;
        }
        else
        {
            this.largura = 1.0;
            System.out.println("Largura inválida. Valor padrão 1.0 utilizado.");
        }
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        if(altura > 0)
        {
            this.altura = altura;
        }
        else
        {
            this.altura = 1.0;
            System.out.println("Altura inválida. Valor padrão 1.0 utilizado.");
        }
    }

    public double calcularArea()
    {
        return largura * altura;
    }

    public double calcularPerimetro()
    {
        return 2 * (largura + altura);
    }
}
