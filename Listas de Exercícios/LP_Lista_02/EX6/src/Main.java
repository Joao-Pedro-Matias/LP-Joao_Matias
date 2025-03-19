import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a velocidade em m/s: ");
        n1 = in.nextDouble();

        result = n1 * 3.6;

        System.out.println("A velocidade em Km/h é: " + result);

    }
}