package aula04.atividade03;

import java.util.Scanner;

public class Atividade02
{
    public static void main(String[] args)
    {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        nota = sc.nextInt();

        if((nota >= 0) && (nota <= 3))
        {
            System.out.println("Você precisa melhorar muito!");
        }
        else if((nota > 3) && (nota < 7))
        {
            System.out.println("Você está quase conseguindo!");
        }
        else if((nota >= 7) && (nota < 9))
        {
            System.out.println("Você conseguiu!");
        }
        else
        {
            System.out.println("Você conseguiu com distinção!");
        }
    }
}