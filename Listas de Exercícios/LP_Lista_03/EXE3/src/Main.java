import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double score1, score2, mean;

        System.out.println("Digite as duas notas separadas por espaço:");
        score1 = in.nextDouble();
        score2= in.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("A média é: " + mean);

        System.out.println(mean<50? "Aluno reprovado" : "Aluno aprovado");

    }
}