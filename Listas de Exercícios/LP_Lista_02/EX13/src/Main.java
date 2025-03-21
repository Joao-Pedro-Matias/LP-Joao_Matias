import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double result;

        System.out.println("Escreva o raio do circulo: ");
        n1 = in.nextDouble();

        result = n1*n1*3.1415;

        System.out.println("A área desse circulo é aproximadamente: " + result);

    }
}