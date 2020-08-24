package aula04.atividade03;

import java.util.Scanner;

public class Atividade01
{
    public static void main(String[] args)
    {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        n2 = sc.nextInt();

        if(n1 == n2)
        {
            System.out.println("Os números digitados são iguais!");
        }
        else if(n1 > n2)
        {
            System.out.println("O maior número é: " + n1);
        }
        else
        {
            System.out.println("O maior número é: " + n2);
        }
    }
}