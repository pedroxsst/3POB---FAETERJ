package Lista08.Exercicio04;

/*
Exercício 4: Carro com leitura do estado de movimento.
Controlar a velocidade somente pelos métodos acelerar e frear.
*/
public class Main
{
    public static void main(String[] args)
    {
        Carro carro = new Carro("Civic", 2025);

        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        carro.acelerar(60);
        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());

        carro.frear(100);
        System.out.println("Velocidade final: " + carro.getVelocidadeAtual() + " km/h");
    }
}
