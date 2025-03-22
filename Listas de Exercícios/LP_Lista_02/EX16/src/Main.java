import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;
        double result;

        System.out.println("Escreva o raio do cone: ");
        n1 = in.nextDouble();

        System.out.println("Escreva a altura do cone:");
        n2 = in.nextDouble();

        result = n1*n1*3.1415*n2/3;

        System.out.println("O volume do cone é: " + result);

    }
}