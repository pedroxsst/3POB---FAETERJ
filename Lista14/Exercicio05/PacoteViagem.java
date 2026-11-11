package Lista14.Exercicio05;

public class PacoteViagem {
    private final double passagem;
    private final double hospedagem;

    public PacoteViagem(double passagem, double hospedagem) {
        this.passagem = passagem;
        this.hospedagem = hospedagem;
    }

    public double getPassagem() {
        return passagem;
    }

    public double getHospedagem() {
        return hospedagem;
    }

    public double getTotal() {
        return passagem + hospedagem;
    }
}
