package Lista14.Exercicio01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidadorSenhaTest {
    private final ValidadorSenha validador = new ValidadorSenha();

    @ParameterizedTest
    @ValueSource(strings = {"Senha123", "Abcdefg1", "SenhaForte2026", "XyZ12345"})
    void deveAceitarSenhasFortes(String senha) {
        assertTrue(validador.isForte(senha));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
        "curta1A", "abcdefgh", "abcdefg1", "ABCDEFGH",
        "12345678", "A1bcdef", "SemNumeros", "senhafraca123"
    })
    void deveRejeitarSenhasInvalidas(String senha) {
        assertFalse(validador.isForte(senha));
    }
}
