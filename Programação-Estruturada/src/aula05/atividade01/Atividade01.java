package aula05.atividade01;

public class Atividade01
{
    public static void main(String[] args)
    {
        String texto = "*";
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(texto);
            texto = texto + "*";
        }
    }
}