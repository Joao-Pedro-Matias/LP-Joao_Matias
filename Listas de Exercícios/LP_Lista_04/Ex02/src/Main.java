import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, n3, n4, n5, bigger, smaller;
        bigger=0;

        System.out.println("Digite 5 números separados por espaço");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();

        for(int i=0; i>bigger; i++){
            if (n1>i) bigger=n1;
            if (n2>i) bigger=n2;
            if (n3>i) bigger=n3;
            if (n4>i) bigger=n4;
            if (n5>i) bigger=n5;

        }

        System.out.println("O maior número é:" + bigger);

    }
}