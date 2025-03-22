import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;
        double result;

        System.out.println("Escreva o primeiro numero: ");
        n1 = in.nextDouble();

        System.out.println("Escreva o segundo numero: ");
        n2 = in.nextDouble();

        result = -n2 / n1;

        System.out.println("O resultado é: " + result);

    }
}