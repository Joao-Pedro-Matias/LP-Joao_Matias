import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number, test, test2=0;
        String start;

        for (int k=1;;k++) {

            if (k==1) System.out.println("Está pronto para começar? (Y/N)");
            else System.out.println("Quer jogar mais uma vez? (Y/N)");
            start = in.next();


            System.out.println("-----------------------------------");
            if (Objects.equals(start, "Y") || Objects.equals(start, "y")) {
                test2 = 0;
                System.out.println("JOGO DA TABUADA");
            }
            else {
                System.out.println("Finalizando");
                System.out.println("-----------------------------------");
                break;
            }


            for (int i = 1; i <= 10; i++) {
                if (test2 == 1) break;
                System.out.println("-----------------------------------");
                System.out.println("TABUADA DO " + i);
                System.out.println("-----------------------------------");

                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = ");
                    number = in.nextInt();
                    test = i * j;
                    if (number == test) continue;
                    else {
                        test2 = 1;
                        System.out.println("Você Errou :(");
                        System.out.println("-----------------------------------");
                        break;
                    }
                }
            }
        }
    }
}