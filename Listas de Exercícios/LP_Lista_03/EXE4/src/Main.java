import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double score1, score2, rec, mean;

        System.out.println("Escreva as notas separadas por espaço:");
        score1 =in.nextDouble();
        score2 = in.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("A média é:" + mean);

        if(mean>50) System.out.println("Aluno Aprovado");
        else {
            System.out.println("Digite a nota da recuperação:");
            rec = in.nextDouble();

            mean = (mean+rec)/2;
            System.out.println("Nova média: " + mean);

            if (mean>50) System.out.println("Aluno aprovado");
            else System.out.println("Aluno reprovado");
        }

    }
}