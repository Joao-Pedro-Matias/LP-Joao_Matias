import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double number;

        System.out.println("Digite um número:");
        number = in.nextDouble();

        System.out.println("---------------------------\n" +
                "TABUADA D0 " + number + ":\n");

        for(int i=0; i<=10; i++)System.out.println(number + " x " + i + " = " + (number*i));


        System.out.println("---------------------------");

    }
}