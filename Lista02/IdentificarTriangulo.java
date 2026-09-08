package Lista01.Lista02;
/*
Classificação de Triângulos

Enunciado: Crie um programa que leia os três lados de um triângulo (A, B e C).
Primeiro, verifique se as medidas formam um triângulo válido 
(a soma de dois lados quaisquer deve ser sempre maior que o terceiro lado). 
Se for válido, classifique-o como:

- Equilátero: Todos os três lados iguais.

- Isósceles: Apenas dois lados iguais.

- Escaleno: Todos os três lados diferentes.

Se não formar um triângulo, exiba uma mensagem de erro.

Conceitos: Condicionais aninhadas, validação de dados prévia e 
operadores de igualdade/desigualdade (==, !=).

*/
import java.util.Scanner;

public class IdentificarTriangulo
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int ladoA = input.nextInt();
        System.out.print("Digite o lado B: ");
        int ladoB = input.nextInt();
        System.out.print("Digite o lado C: ");
        int ladoC = input.nextInt();

        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA)
        {
            if(ladoA == ladoB && ladoB == ladoC)
            {
                System.out.println("Triângulo Equilátero");
            }
            else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
            {
                System.out.println("Triângulo Isósceles");
            }
            else
            {
                System.out.println("Triângulo Escaleno");
            }
        }
        else
        {
            System.out.println("As medidas não formam um triângulo.");
        }

        input.close();
    }
}