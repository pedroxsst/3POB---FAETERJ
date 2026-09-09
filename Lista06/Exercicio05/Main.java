package Lista06.Exercicio05;

/*
Exercício 5: Boletim de um aluno.
Calcular a média e verificar a aprovação. O enunciado exige média maior que 7.
*/

import java.text.DecimalFormat;

class Aluno
{
    String nome;
    String matricula;
    double nota1;
    double nota2;

    double calcularMedia()
    {
        return (nota1 + nota2) / 2;
    }

    String verificarAprovacao()
    {
        if (this.calcularMedia() > 7)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }

    void imprimirBoletim()
    {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media: " + df.format(this.calcularMedia()));
        System.out.println("Situacao: " + this.verificarAprovacao());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno();

        aluno.nome = "Pedro";
        aluno.matricula = "2026001";
        aluno.nota1 = 8;
        aluno.nota2 = 9;

        aluno.imprimirBoletim();
    }
}
