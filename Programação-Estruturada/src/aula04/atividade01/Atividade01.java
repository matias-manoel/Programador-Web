package aula04.atividade01;

import java.util.Scanner;

public class Atividade01
{
    public static void main(String[] args)
    {
        int n1, n2, n3, n4, n5, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        System.out.print("Digite um número: ");
        n2 = sc.nextInt();

        System.out.print("Digite um número: ");
        n3 = sc.nextInt();

        System.out.print("Digite um número: ");
        n4 = sc.nextInt();

        System.out.print("Digite um número: ");
        n5 = sc.nextInt();

        soma = n1 + n2 + n3 + n4 + n5;

        if(soma % 2 == 0)
        {
            System.out.println("Múltiplo de 2!");
        }
    }
}