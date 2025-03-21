import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a medida em milímetros: ");
        n1 = in.nextDouble();

        result = n1/25.4;

        System.out.println("A medida em polegadas é: " + result);

    }
}