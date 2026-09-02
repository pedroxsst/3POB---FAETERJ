/*
Exercício 2: Maior, Menor e suas Posições

Enunciado: Crie um programa que preencha um vetor de 10 números inteiros. 
O programa deve percorrer o vetor e identificar:
    - O maior valor e o índice onde ele se encontra.
    - O menor valor e o índice onde ele se encontra:
    
Conceitos: Inicialização de variáveis de controle com o primeiro elemento (vetor[0]),
busca linear e rastreamento de índices.
*/
import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];
        int maior;
        int menor;
        int posMenor;
        int posMaior;
        
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um numero inteiro");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];
        menor = vetor[0];
        posMenor = 0;
        posMaior = 0;

        for(int i = 1; i < vetor.length; i++)
        {
            if(vetor[i] > maior)
            {
                maior = vetor[i];
                posMaior = i;
            }

            if(vetor[i] < menor)
            {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);
        input.close();
    }
}