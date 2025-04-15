import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number, test, test2, i;

        test2 = 0;

        System.out.println("Digite um número:");
        number = in.nextInt();

        if (number <= 1) test2 = 1;
        else {
            test = number % 2;
            if (test == 0) test2 = 1;
            else {
                test = number / 2;
                i = test;
                while (i > 3) {
                    test = number % i;
                    if (test == 0) {
                        test2 = 1;
                        System.out.println(i);
                    }
                    i--;

                }
            }
        }
        if (test2 == 1) System.out.println("Número não primo");
        if (test2 == 0) System.out.println("Número primo");

    }
}
