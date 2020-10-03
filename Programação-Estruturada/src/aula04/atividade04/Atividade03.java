package aula04.atividade04;

import java.util.Scanner;

public class Atividade03
{
    public static void main(String[] args)
    {
        char letra;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        letra = sc.nextLine().charAt(0);

        switch(letra)
        {
            case 'B':
                System.out.println("O nome do país é Brasil.");
                break;
            case 'C':
                System.out.println("O nome do país é China.");
                break;
            case 'E':
                System.out.println("O nome do país é Estados Unidos.");
                break;
            default:
                System.out.println("Não existe país com a letra informada!");
        }
    }
}