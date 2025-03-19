import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Digite um número:");
        n1 = in.nextDouble();
        result = n1/5;

        System.out.println("A quinta parte de " + n1 + " é: " + result );

    }
}