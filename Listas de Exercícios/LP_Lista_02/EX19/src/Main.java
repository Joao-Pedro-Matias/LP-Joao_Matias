import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a;
        double b;
        double c;
        double delta;
        double result1;
        double result2;


        System.out.println("Escreva o primeiro numero: ");
        a = in.nextDouble();

        System.out.println("Escreva o segundo numero: ");
        b = in.nextDouble();

        System.out.println("Escreva o terceiro numero: ");
        c = in.nextDouble();

        delta = b*b - 4*a*c;
        delta = Math.pow(delta, 0.5);

        System.out.println("Delta: " + delta);

        result1 = (-b + delta) / (2*a);
        result2 = (-b - delta) / (2*a);

        System.out.println("O primeiro resultado é: " + result1);
        System.out.println("O segundo resultado é: " + result2);

    }
}