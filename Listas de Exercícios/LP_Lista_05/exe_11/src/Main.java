import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int l1, l2, c1, c2;

        Scanner in = new Scanner(System.in);

        //Pergunta sobre o tamanho das matrizes

        System.out.println("Quantidade de linhas da primeira matriz:");
        l1 = in.nextInt();

        System.out.println("Quantidade de colunas da primeira matriz:");
        c1 = in.nextInt();

        System.out.println("Quantidade de linhas da segunda matriz:");
        l2 = in.nextInt();

        System.out.println("Quantidade de colunas da segunda matriz:");
        c2 = in.nextInt();

        //Verifica se é possível de fazer a multiplicação entre as matrizes

        if (!(c1 ==l2)) System.out.println("Para fazer a multiplicação de matrizes o número de colunas da primeira matriz tem que ser igual ao número de linhas da segunda matriz!");
        else {

            int [] [] matriz1 = new int[l1][c1];

            int [] [] matriz2 = new int[l2][c2];

            int [] [] result = new int[l1][c1];

            //Pergunta os valores da 1º Matriz

            System.out.println("----------------------------------\n" +
                "Matriz 1");

            for (int i=0; i<l1; i++)
                for (int j=0; j<c1; j++){
                    System.out.println("Número da linha " + (i+1) + " coluna " + (j+1) + ":" );
                    matriz1[i][j] = in.nextInt();
                }


            //Pergunta os valores da 2º Matriz

            System.out.println("----------------------------------\n" +
                "Matriz 2");

            for (int i=0; i<l2; i++)
                for (int j=0; j<c2; j++){
                    System.out.println("Número da linha " + (i+1) + " coluna " + (j+1) + ":" );
                    matriz2[i][j] = in.nextInt();
                }


            System.out.println("----------------------------------");

            //Multiplicação entre as matrizes

            for (int i=0; i<l1; i++)
                for (int j=0; j<c1; j++)
                    for (int k = 0; k <c1; k++)
                        result[i][j] += matriz1[i][k] * matriz2 [k][j];

            //Escreve as Matrizes

            System.out.println("Matriz 1");

            for (int i=0; i<l1; i++) {
                for (int j = 0; j<c1; j++)
                    System.out.printf(matriz1[i][j] + " ");
                System.out.println("");
            }

            System.out.println("Matriz 2");

            for (int i=0; i<l2; i++) {
                for (int j = 0; j<c2; j++)
                    System.out.printf(matriz2[i][j] + " ");
                System.out.println("");
            }

            System.out.println("Matriz Resultado");

            for (int i=0; i<l1; i++) {
                for (int j = 0; j<c1; j++)
                    System.out.printf(result[i][j] + " ");
                System.out.println("");
            }
        }

    }
}