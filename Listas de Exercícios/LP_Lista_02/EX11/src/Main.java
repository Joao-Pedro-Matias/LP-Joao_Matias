import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a temperatura em celsius: ");
        n1 = in.nextDouble();

        result = n1 * 1.8 + 32;

        System.out.println("A temperatura em fahrenheit: " + result);

    }
}