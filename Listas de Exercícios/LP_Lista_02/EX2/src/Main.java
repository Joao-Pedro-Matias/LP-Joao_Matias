import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Digite um número:");
        n1 = in.nextDouble();
        result = n1*n1;

        System.out.println("O quadrado de " + n1 + " é: " + result );

    }
}