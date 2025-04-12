import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a, b, c, test1, test2, test3;

        System.out.println("Digite os três lados do triângulo separados por um espaço:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        test1 = b+c;
        test2 = Math.abs(b-c);

        if (a<test1 && a>test2) {
            System.out.println("Seu triângulo existe!");

            if (a==b && a==c) System.out.println("Triângulo equilátero");
            else if (a==b || a==c || b==c) System.out.println("Triângulo isósceles");
            else System.out.println("Triângulo escaleno");
        }
        else System.out.println("Seu triângulo não exite :(");

    }
}