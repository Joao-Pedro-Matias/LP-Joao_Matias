import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;
        double result1;
        double result2;

        System.out.println("Escreva a primeira raiz: ");
        n1 = in.nextDouble();

        System.out.println("Escreva a segunda raiz: ");
        n2 = in.nextDouble();

        result1 = n1 + n2;
        result2 = n1 * n2;

        System.out.println("O fórmula é: x² + " + -result1 + "x + " + result2);

    }
}