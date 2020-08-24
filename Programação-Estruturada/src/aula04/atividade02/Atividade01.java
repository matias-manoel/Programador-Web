package aula04.atividade02;

import java.util.Scanner;

public class Atividade01
{
    public static void main(String[] args)
    {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("O número digitado é par!");
        }
        else
        {
            System.out.println("O número digitado é ímpar!");
        }
    }
}