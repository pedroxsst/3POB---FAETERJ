package Lista15.Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalculadoraEstatistica<T extends Number> {
    private final List<T> numeros = new ArrayList<>();

    public void adicionar(T numero) {
        numeros.add(Objects.requireNonNull(numero, "Numero nao pode ser nulo."));
    }

    public double calcularMedia() {
        validarNaoVazia();
        double soma = 0;
        for (T numero : numeros) {
            soma += numero.doubleValue();
        }
        return soma / numeros.size();
    }

    public double calcularMaior() {
        validarNaoVazia();
        double maior = Double.NEGATIVE_INFINITY;
        for (T numero : numeros) {
            maior = Math.max(maior, numero.doubleValue());
        }
        return maior;
    }

    private void validarNaoVazia() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("Adicione numeros antes de calcular.");
        }
    }
}
