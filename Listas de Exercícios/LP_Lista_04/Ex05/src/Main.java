import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, fatorial=1;

        System.out.println("Digite um numero");
        n = in.nextInt();

        System.out.println("Fatorial de " + n + " é:");

        while (n>1) {
            fatorial*=n;
            n--;
        }

        System.out.println(fatorial);

    }
}