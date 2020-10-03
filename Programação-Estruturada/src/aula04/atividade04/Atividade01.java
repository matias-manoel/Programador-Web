package aula04.atividade04;

import java.util.Scanner;

public class Atividade01
{
    public static void main(String[] args)
    {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = leitor.nextInt();

        switch(numero)
        {
            case 9:
                System.out.println("O número é igual a 9.");
                break;
            case 10:
                System.out.println("O número é igual a 10.");
                break;
            case 11:
                System.out.println("O número é igual a 11.");
                break;
            default:
                System.out.println("O número não é nem 9, nem 10, nem 11.");
        }
    }
}