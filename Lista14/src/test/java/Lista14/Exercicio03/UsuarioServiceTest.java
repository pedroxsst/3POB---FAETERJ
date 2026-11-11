package Lista14.Exercicio03;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {
    @Mock
    private UsuarioRepository repository;

    @InjectMocks
    private UsuarioService service;

    @Test
    void deveAtualizarEmailESalvarUmaVez() {
        Usuario usuarioExistente = new Usuario(1L, "Ana Lima", "antigo@exemplo.com");
        when(repository.buscarPorId(1L)).thenReturn(Optional.of(usuarioExistente));

        service.atualizarEmail(1L, "novo@exemplo.com");

        assertEquals("novo@exemplo.com", usuarioExistente.getEmail());
        verify(repository, times(1)).salvar(any(Usuario.class));
        verify(repository).salvar(usuarioExistente);
    }

    @Test
    void naoDeveSalvarSeUsuarioNaoExiste() {
        when(repository.buscarPorId(99L)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class,
            () -> service.atualizarEmail(99L, "novo@exemplo.com"));

        verify(repository, never()).salvar(any(Usuario.class));
    }
}
