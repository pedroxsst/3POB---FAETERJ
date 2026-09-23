package Lista09.Exercicio03;

/*
Exercício 3: Múltipla implementação de interfaces.
Separar os contratos de autenticação e exportação em JSON.
*/
public class Main
{
    public static void main(String[] args)
    {
        Usuario usuario = new Usuario("pedro", "1234");
        Administrador administrador = new Administrador("admin", "abcd", "total");

        System.out.println("Usuário autenticado: " + usuario.autenticar("1234"));
        System.out.println("Administrador autenticado: " + administrador.autenticar("abcd"));
        System.out.println("Administrador em JSON: " + administrador.exportarJSON());
    }
}
