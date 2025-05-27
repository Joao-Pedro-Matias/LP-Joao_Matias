import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        System.out.println("Digite um número:");
        n = in.nextInt();

        if (n<0) {
            System.out.println("Digite um número maior que zero:");
            n = in.nextInt();
        }

        n = multNumbers(n);

        System.out.println("Soma dos antecessores: " + n);

    }

    public static int multNumbers(int n){
        if (n == 1) return 1;
        return n +multNumbers(n - 1);
    }
}