import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int n;

        System.out.println("Digite o número a ser buscado: ");
        n = in.nextInt();

        int result = findNumber(numbers, n);

    }

    public static int findNumber(int [] numbers, int n) {
        int max = 0;
        int min = 0;
        if (n>numbers[numbers.length/2]) {

        }
    }
}