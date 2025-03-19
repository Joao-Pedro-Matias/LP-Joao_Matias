import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;
        double result;

        System.out.println("Digite a primeira nota:");
        n1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = in.nextDouble();
        result = (n1+n2)/2;

        System.out.println("A média é: " + result );

    }
}