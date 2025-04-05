import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, n3;
        int test=0;

        System.out.println("Digite três números separados por espaço:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        if (n1>n2 && n1>n3){
            if (n2>n3) System.out.println(n1 + " , " + n2 + " , " + n3);
            else System.out.println(n1 + " , " + n3 + " , " + n2);
        }
        else if (n2>n1 && n2>n3) {
            if (n1>n3) System.out.println(n2 + " , " + n1 + " , " + n3);
            else System.out.println(n2 + " , " + n3 + " , " +  n1);
        }
        else if (n3>n1 && n3>n2) {
            if (n1>n2) System.out.println(n3 + " , " + n1 + " , " + n2);
            else System.out.println(n3 + " , " + n2 + " , " + n1);
        }
        else {
            if (n1==n2) test=1;
            if (n1==n3) test=2;
            if (n2==n3) test=3;
            if (n1==n2 && n1==n3) test=4;

            switch (test) {
                case 1:
                    if (n1>n3) System.out.println(n1 + " , " + n2 + " , " + n3);
                    else System.out.println((n3 + " , " + n1 + " , " + n2));
                    break;
                case 2:
                    if (n1>n2) System.out.println(n1 + " , " + n3 + " , " + n2);
                    else System.out.println(n2 + " , " + n1 + " , " + n3);
                    break;
                case 3:
                    if (n2>n1) System.out.println(n2 + " , " + n3 + " , " + n1);
                    else System.out.println(n1 + " , " + n2 + " , " + n3);
                    break;
                case 4:
                    System.out.println(n1 + " , " + n2 + " , " + n3);
                    break;
            }
        }
    }
}