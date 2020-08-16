package aula03.atividade02;

import java.util.Scanner;

public class Atividade01
{
    public static void main(String[] args)
    {
        String nome;
        int idade;
        double altura;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Olá, " + nome + ", Digite agora sua idade:");
        idade = leitor.nextInt();

        System.out.println(idade + " anos, muito bem!");
        System.out.println("Digite agora sua altura:");
        altura = leitor.nextDouble();

        System.out.println("Ok, entendi, você tem " + altura + "m de altura.");
    }
}