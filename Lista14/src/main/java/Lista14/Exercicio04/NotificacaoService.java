package Lista14.Exercicio04;

import Lista14.Exercicio03.Usuario;
import java.util.Objects;

public class NotificacaoService {
    private final EmailSender emailSender;

    public NotificacaoService(EmailSender emailSender) {
        this.emailSender = Objects.requireNonNull(emailSender);
    }

    public void notificarBoasVindas(Usuario usuario) {
        Objects.requireNonNull(usuario);
        String primeiroNome = usuario.getNome().trim().split("\\s+")[0];
        String assunto = "Bem-vindo, " + primeiroNome + "!";
        String corpo = "Olá, " + primeiroNome + "! Seu cadastro foi realizado com sucesso.";
        emailSender.enviar(usuario.getEmail(), assunto, corpo);
    }
}
