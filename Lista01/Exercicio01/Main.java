package Lista01.Exercicio01;

/*
Exercício 1: Calculadora de Média Simples Enunciado: 
Escreva um programa em Java que leia três notas de um 
aluno (números decimais), calcule e exiba a média 
aritmética simples dessas notas.

Conceitos: Leitura de dados (Scanner), variáveis do tipo double,
operadores aritméticos de soma e divisão.

Exemplo de Entrada: 7.5, 8.0, 6.5 Saída esperada: Média: 7.33
 */


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a nota da av1: ");
        double av1 = sc.nextDouble();
        System.out.print("Digite a nota da av2: ");
        double av2 = sc.nextDouble();
        System.out.print("Digite a nota da av3: ");
        double av3 = sc.nextDouble();

        double media = (av1 + av2 + av3) / 3;

        System.out.println("As notas das provas são, respectivamente: "
        + df.format(av1) + ", " + df.format(av2) + ", " + df.format(av3));
        System.out.print("A média é: "+ df.format(media));

        sc.close();
    }
}
