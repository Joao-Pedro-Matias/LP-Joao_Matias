import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        int n=0, test=0;

        System.out.println("Informe o número de busca");
        n = in.nextInt();

        for (int i=0; i<numbers.length; i++) {
            if (n == numbers[i]) System.out.println("Valor encontrado na posição " + i);
            else test++;
            if (test==numbers.length) System.out.println("Número não encontrado");
        }


    }
}