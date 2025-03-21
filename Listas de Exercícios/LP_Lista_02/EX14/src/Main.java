import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;
        double result;

        System.out.println("Escreva a base do triângulo: ");
        n1 = in.nextDouble();

        System.out.println("Escreva a altura do triângulo: ");
        n2 = in.nextDouble();

        result = n1 * n2 / 2;

        System.out.println("A área do triângulo é: " + result);

    }
}