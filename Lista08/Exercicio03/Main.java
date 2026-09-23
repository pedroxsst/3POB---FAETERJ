package Lista08.Exercicio03;

/*
Exercício 3: Retângulo com validação nos setters.
Garantir medidas positivas desde a criação do objeto.
*/
public class Main
{
    public static void main(String[] args)
    {
        Retangulo retangulo = new Retangulo(5, -3);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
