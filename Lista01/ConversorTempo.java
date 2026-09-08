/*
Conversor de Tempo (Segundos para Horas, Minutos e Segundos)

Enunciado: Escreva um programa que leia um valor inteiro representando 
um total de segundos e o decomponha em horas, minutos e segundos restantes.

Conceitos: Divisão inteira (/) e operador de resto da divisão (%).

Exemplo de Entrada: 3665 Saída esperada: 1 hora(s), 1 minuto(s) e 5 segundo(s)
 */


import java.util.Scanner;

public class ConversorTempo
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o total de segundos: ");
        int tempoSegundos = input.nextInt();

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");
        input.close();
    }
}