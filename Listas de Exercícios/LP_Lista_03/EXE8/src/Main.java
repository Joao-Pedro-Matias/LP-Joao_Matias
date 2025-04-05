import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int number;

        System.out.println("Digite o número: ");
        number = in.nextDouble();

        number = number%2;

        if (number == 0) System.out.println("Número par");
        else System.out.println("Número ímpar");
    }
}