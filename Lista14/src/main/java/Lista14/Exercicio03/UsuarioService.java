package Lista14.Exercicio03;

import java.util.Objects;

public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    public void atualizarEmail(Long id, String novoEmail) {
        Usuario usuario = repository.buscarPorId(id)
            .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado: " + id));
        usuario.setEmail(novoEmail);
        repository.salvar(usuario);
    }
}
