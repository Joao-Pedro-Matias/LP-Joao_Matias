import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite dois números separados por espaço:");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1>n2) for (int i=n2+1; i<n1; i++) System.out.println(i);
        else if (n2>n1) for (int i=n1+1; i<n2; i++) System.out.println(i);
        else System.out.println("Números iguais");

    }
}