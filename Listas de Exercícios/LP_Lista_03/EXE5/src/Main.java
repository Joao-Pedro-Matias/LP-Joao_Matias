import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double score1, score2, mean;

        System.out.println("Digite a primeira nota:");
        score1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("Média: " + mean);

        if(mean>=85) System.out.println("Nota A");
        else if (mean>=70) System.out.println("Nota B");
        else if (mean>=50) System.out.println("Nota C");
        else System.out.println("Nota D");

    }
}