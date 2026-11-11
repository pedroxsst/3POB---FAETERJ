package Lista16.Exercicio01;

public class ValidadorSenha {
    public boolean isForte(String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }

        boolean temNumero = false;
        boolean temMaiuscula = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                temNumero = true;
            }
            if (Character.isUpperCase(caractere)) {
                temMaiuscula = true;
            }
        }

        return temNumero && temMaiuscula;
    }
}
