package Lista15.Exercicio02;

import java.util.Objects;

public class Par<K, V> {
    private final K chave;
    private final V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "[Chave: " + chave + ", Valor: " + valor + "]";
    }

    public static <K, V> boolean saoIguais(Par<K, V> p1, Par<K, V> p2) {
        if (p1 == p2) {
            return true;
        }
        if (p1 == null || p2 == null) {
            return false;
        }
        return Objects.equals(p1.chave, p2.chave)
                && Objects.equals(p1.valor, p2.valor);
    }
}
