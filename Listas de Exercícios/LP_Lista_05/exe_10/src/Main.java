public class Main {
    public static void main(String[] args) {

        int [] [] matriz1 = {{1,2},
                             {3,4},
                             {5,6}};

        int [] [] matriz2 = {{7,8},
                             {9,10,}};

        int [] [] result = new int[3][2];

        for (int i=0; i<3; i++)
            for (int j=0; j<2; j++)
                for (int k = 0; k <2; k++)
                    result[i][j] += matriz1[i][k] * matriz2 [k][j];

        for (int i=0; i<3; i++) {

            for (int j = 0; j<2; j++)
                System.out.printf(result[i][j] + " ");

            System.out.println("");
        }
    }
}