import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double velocity;
        double acceleration;
        double time;
        double result;

        System.out.println("Escreva a velocidade inicial: ");
        velocity = in.nextDouble();

        System.out.println("Escreva a aceleração: ");
        acceleration = in.nextDouble();

        System.out.println("Escreva o tempo: ");
        time = in.nextDouble();


        result = velocity * time + acceleration * time * time / 2;
        result = result / time;

        System.out.println("A velocidade média é: " + result);

    }
}