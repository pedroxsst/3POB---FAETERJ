package Lista12.Exercicio03;

public class Aluno
{
    private String nome;
    private String curso;
    private double notaFinal;

    public Aluno(String nome, String curso, double notaFinal)
    {
        this.nome = nome;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCurso()
    {
        return curso;
    }

    public double getNotaFinal()
    {
        return notaFinal;
    }

    @Override
    public String toString()
    {
        return nome + " (nota: " + notaFinal + ")";
    }
}
