package Lista07.Exercicio03;

/*
Exercício 3: Sistema de notificações.
Receber qualquer tipo de notificação em um método e executar o envio.
*/
public class Main
{
    public static void processarEnvio(Notificacao notificacao, String texto)
    {
        notificacao.enviar(texto);
    }

    public static void main(String[] args)
    {
        Notificacao email = new EmailNotificacao("pedro@email.com");
        Notificacao sms = new SmsNotificacao("21999999999");
        Notificacao push = new PushNotificacao("Dispositivo01");

        processarEnvio(email, "Sua compra foi aprovada.");
        processarEnvio(sms, "Seu código é 1234.");
        processarEnvio(push, "Você recebeu uma nova mensagem.");
    }
}
