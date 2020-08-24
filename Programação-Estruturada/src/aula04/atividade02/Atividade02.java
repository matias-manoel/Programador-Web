package aula04.atividade02;

import java.util.Scanner;

public class Atividade02
{
    public static void main(String[] args)
    {
        int idade1, idade2;
        String nome1, nome2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome1 = sc.next();

        System.out.print("Digite sua idade " + nome1 + ": ");
        idade1 = sc.nextInt();

        System.out.print("Digite seu nome: ");
        nome2 = sc.next();

        System.out.print("Digite sua idade " + nome2 + ": ");
        idade2 = sc.nextInt();

        if(idade1 > idade2)
        {
            System.out.println("O nome da pessoa mais velha é: " + nome1);
        }
        else
        {
            System.out.println("O nome da pessoa mais velha é: " + nome2);
        }
    }
}