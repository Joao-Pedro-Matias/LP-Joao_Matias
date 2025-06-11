import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int [] numbers = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int n;

        System.out.println("Digite o número a ser buscado: ");
        n = in.nextInt();

        int result = findNumber(numbers, n, 0,numbers.length-1, 0);

        if (result == -1) System.out.println("Não foi encontrado esse número no vetor");
        else System.out.println("Foi encontrado o numero " + numbers[result] + " na casa " + result);


    }

    public static int findNumber(int [] numbers, int n, int min, int max, int mid) {

        mid = (max + min) / 2;
        if (n == numbers[mid]) return mid;
        if (min >= max) return -1;
        else {
            if (n > numbers[mid]) min = mid+1;
            else max = mid-1;

            return findNumber(numbers, n,min,max,mid);
        }
    }
}