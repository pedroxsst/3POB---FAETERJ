package Lista06.Exercicio01;

/*
Exercício 1: Modelagem da classe Livro.
Criar dois livros, preencher seus atributos e exibir as informações.
*/

class Livro
{
    String titulo;
    String autor;
    int numeroPaginas;

    void exibirInformacoes()
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupery";
        livro2.numeroPaginas = 96;

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
