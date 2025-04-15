import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, fatorial=1;

        System.out.println("Digite um numero");
        n = in.nextInt();


        for(int i=n; i>1; i--)
            fatorial = i * fatorial;

        System.out.println("Fatorial de " + n + " é: " + fatorial);



    }
}