package aula03.atividade02;

import java.util.Scanner;

public class Atividade03
{
    public static void main(String[] args)
    {
        String nomeAluno, nomeDisciplina;
        float nota1, nota2, nota3, nota4, media;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno: ");
        nomeAluno = leitor.nextLine();

        System.out.print("Digite o nome da Disciplina: ");
        nomeDisciplina = leitor.nextLine();

        System.out.print("Digite a nota da 1ª prova: ");
        nota1 = leitor.nextFloat();

        System.out.print("Digite a nota da 2ª prova: ");
        nota2 = leitor.nextFloat();

        System.out.print("Digite a nota da 3ª prova: ");
        nota3 = leitor.nextFloat();

        System.out.print("Digite a nota da 4ª prova: ");
        nota4 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nNa disciplina de " + nomeDisciplina + ", o aluno " + nomeAluno + " ficou com média " + media);
    }
}