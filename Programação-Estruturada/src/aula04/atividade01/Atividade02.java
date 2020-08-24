package aula04.atividade01;

import java.util.Scanner;

public class Atividade02
{
    public static void main(String[] args)
    {
        int ladoA, ladoB, ladoC;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um comprimento: ");
        ladoA = sc.nextInt();

        System.out.print("Digite um comprimento: ");
        ladoB = sc.nextInt();

        System.out.print("Digite um comprimento: ");
        ladoC = sc.nextInt();

        if((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB)))
        {
            System.out.println("Os comprimentos formam um triângulo!");
        }
    }
}