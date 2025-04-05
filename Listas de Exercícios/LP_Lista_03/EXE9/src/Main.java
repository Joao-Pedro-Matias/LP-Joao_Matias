import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a, b, c, test1, test2;

        System.out.println("Digite os três lados do triângulo separados por um espaço:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        test1 = b+c;
        if (b>c)test2 = b-c;
        else test2 = c-b;

        System.out.println("Teste 1: " + test1);
        System.out.println("Teste 2: " + test2);

        if (a<test1 && a>test2) {
            System.out.println("Seu triângulo existe!");

            if (a==b && a==c) System.out.println("Triângulo equilátero");
            else if (a==b || a==c || b==c) System.out.println("Triângulo isósceles");
            else System.out.println("Triângulo escaleno");


        }
        else System.out.println("Seu triângulo não exite :(");

    }
}