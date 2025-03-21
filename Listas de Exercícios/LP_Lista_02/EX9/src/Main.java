import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a medida em quilômetros: ");
        n1 = in.nextDouble();

        result = n1 / 1.60934;

        System.out.println("A medida em milhas é aproximadamente: " + result);

    }
}