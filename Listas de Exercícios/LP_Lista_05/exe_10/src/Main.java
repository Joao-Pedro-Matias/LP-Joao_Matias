public class Main {
    public static void main(String[] args) {

        int [] [] matriz1 = {{3,3},
                             {3,3},
                             {3,3}};

        int [] [] matriz2 = {{2,2},
                             {2,2,}};

        int n1, n2, n3, n4, n5, n6;

        n1 = matriz1[0] [0] * matriz2 [0] [0] + matriz1[0] [1] * matriz2 [1] [0];
        n2 = matriz1[0] [0] * matriz2 [0] [1] + matriz1[0] [1] * matriz2 [1] [1];
        n3 = matriz1[1] [0] * matriz2 [0] [0] + matriz1[1] [1] * matriz2 [1] [0];
        n4 = matriz1[1] [0] * matriz2 [0] [1] + matriz1[1] [1] * matriz2 [1] [1];
        n5 = matriz1[2] [0] * matriz2 [0] [0] + matriz1[2] [1] * matriz2 [1] [0];
        n6 = matriz1[2] [0] * matriz2 [0] [1] + matriz1[2] [1] * matriz2 [1] [1];

        System.out.println( n1 + " " + n2 + "\n" +
                            n3 + " " + n4 + "\n" +
                            n5 + " " + n6 + "\n");



    }
}