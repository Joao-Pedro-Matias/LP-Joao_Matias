import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a temperatura em fahrenheit: ");
        n1 = in.nextDouble();

        result = (n1-32) * 5/9;

        System.out.println("A temperatura em celsius: " + result);

    }
}