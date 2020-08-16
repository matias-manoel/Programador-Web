package aula03.atividade02;

import java.util.Scanner;

public class Atividade02
{
    public static void main(String[] args)
    {
        String frase1;
        String frase2;
        String frase3;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira frase: ");
        frase1 = leitor.nextLine();

        System.out.print("Digite a segunda frase: ");
        frase2 = leitor.nextLine();

        System.out.print("Digite a terceira frase: ");
        frase3 = leitor.nextLine();

        System.out.println("\nImprimindo frases na ordem inversa:\n");
        System.out.println(frase3);
        System.out.println(frase2);
        System.out.println(frase1);
    }
}