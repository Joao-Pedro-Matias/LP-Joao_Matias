import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, number, lastNumber, numberPrint;
        number = 1;
        lastNumber = 0;
        numberPrint = 0;

        System.out.println("Até quantos numeros você quer ver a sequência?");
        n = in.nextInt();

        for (int i=0; i<n; i++) {

            if (i == 0 ){
                System.out.print("0, ");
                continue;
            }

            lastNumber = number;
            number = numberPrint;
            numberPrint = number + lastNumber;
            System.out.print(numberPrint + ", ");

        }
    }
}