package Lista16.Exercicio03;

import java.util.Optional;

public interface UsuarioRepository {
    Optional<Usuario> buscarPorId(Long id);
    void salvar(Usuario usuario);
}
