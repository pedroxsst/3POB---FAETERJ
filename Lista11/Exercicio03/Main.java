package Lista11.Exercicio03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Exercício 3: Agrupar os alunos por curso e separar aprovados e reprovados.
A aprovação exige nota maior que 7.0, conforme o enunciado.
*/
public class Main
{
    public static void main(String[] args)
    {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", "ADS", 8.5),
                new Aluno("Bruno", "ADS", 7.0),
                new Aluno("Carla", "Engenharia", 9.0),
                new Aluno("Diego", "Engenharia", 6.5),
                new Aluno("Elisa", "Administracao", 7.5),
                new Aluno("Fabio", "ADS", 5.0));

        Map<String, List<Aluno>> alunosPorCurso = alunos.stream()
                .collect(Collectors.groupingBy(Aluno::getCurso));

        Map<Boolean, List<Aluno>> alunosPorSituacao = alunos.stream()
                .collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));

        System.out.println("Alunos por curso:");
        alunosPorCurso.forEach((curso, grupo) -> System.out.println(curso + ": " + grupo));

        System.out.println("Aprovados: " + alunosPorSituacao.get(true));
        System.out.println("Reprovados: " + alunosPorSituacao.get(false));
    }
}
