import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.println("Escreva os valores do A, B e C separados por um espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        System.out.println(a + "x² + " + b + "x + " + c + " = 0");

        delta = (b*b) - (4*a*c);
        System.out.println("Delta: " + delta);

        if (delta>=0) {

            delta = Math.sqrt(delta);

            x1 = (-b + delta) / (2 * a);
            System.out.println("x1 = " + x1);

            x2 = (-b - delta) / (2 * a);
            System.out.println("x2 = " + x2 );

        } else System.out.println("Delta negativo... Ainda não sei calcular :(");


    }
}