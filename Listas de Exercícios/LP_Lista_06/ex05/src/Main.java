import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int [] numbers = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int n;

        System.out.println("Digite o número a ser buscado: ");
        n = in.nextInt();

        int result = findNumber(numbers, n, numbers.length,0);

        System.out.println(result);
        System.out.println(numbers[result]);

    }

    public static int findNumber(int [] numbers, int n, int len, int aux) {

        if (n == numbers[len/2+aux]) return len/2+aux;
        if (n>numbers[len/2+aux] && n<numbers[len/2+aux]) return -1;
        else {
            if (n > numbers[len/2+aux]) {
                aux += len/2;
                len /= 2;
            }
            else
                len /= 2;
            return findNumber(numbers, n,len,aux);
        }
    }
}