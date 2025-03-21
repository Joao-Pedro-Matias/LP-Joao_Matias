import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva a medida em polegadas: ");
        n1 = in.nextDouble();

        result = n1*25.4;

        System.out.println("A medida em milímetros é: " + result);

    }
}