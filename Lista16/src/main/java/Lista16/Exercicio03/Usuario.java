package Lista16.Exercicio03;

import java.util.Objects;

public class Usuario {
    private final Long id;
    private final String nome;
    private String email;

    public Usuario(Long id, String nome, String email) {
        this.id = Objects.requireNonNull(id);
        this.nome = Objects.requireNonNull(nome);
        setEmail(email);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("E-mail obrigatório.");
        }
        this.email = email;
    }
}
