import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = new int[10];

        int bigger=0, pointerBigger=0;

        System.out.println("Digite 10 números separados por espaço");

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número");
            numbers[i] = in.nextInt();
        }

        for (int i=0; i<numbers.length; i++ ) {
            if (numbers[i]>bigger) {
                bigger = numbers[i];
                pointerBigger = i;
            }
        }

        System.out.println("O maior número é " + bigger + " e foi encontrado na posição " + (pointerBigger+1));

    }
}