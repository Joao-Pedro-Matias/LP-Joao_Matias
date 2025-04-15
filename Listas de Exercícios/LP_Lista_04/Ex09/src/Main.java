import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number, test;

        for (int i=1; i<=10; i++) {
            System.out.println("-----------------------------------");
            System.out.println("TABUADA DO " + i);
            System.out.println("-----------------------------------");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = ");
                number = in.nextInt();
                test = i*j;
                if (number==test) System.out.print(" ");
                else {
                    i = 1000;
                    j = 1000;
                    System.out.println("Você Errou :(");
                }
            }
        }
    }
}