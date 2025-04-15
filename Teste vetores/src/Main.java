import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = {0,6,5,2,1};

        for(int i=0; i<numbers.length; i++)
            System.out.println(numbers[i]);

        System.out.println("         ---------");

        for(int pointer:numbers)
            System.out.println(pointer);

        System.out.println("----------------------------------");

        int [][] matriz1 = new int[4] [2];

        System.out.println("Matriz 1 - Linhas: " + matriz1.length + " Colunas: " + matriz1[1].length);

        System.out.println("         ---------");

        int [][] matriz2 = {{5,8,9},
                            {9,6,5},
                            {2,3,4}};

        System.out.println("Matriz2:");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++)
                System.out.print(matriz2[i][j] + " ");
            System.out.print("\n");
        }

        System.out.println("         ---------");

        for( int [] linha:matriz2){
            for(int coluna:linha) System.out.print(coluna + " ");
            System.out.print("\n");

        }





    }
}