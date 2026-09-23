package Lista07.Exercicio03;

public class Notificacao
{
    protected String destinatario;

    public Notificacao(String destinatario)
    {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem)
    {
        System.out.println("Enviando notificação: " + mensagem);
    }
}
