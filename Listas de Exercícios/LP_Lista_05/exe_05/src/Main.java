public class Main {
    public static void main(String[] args) {

        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, v2 = new int[v1.length];
        int j=0;

        for(int i=v1.length-1; i>=0; i--) {
            v2[j] = v1[i];
            j++;
        }

        System.out.println("Vetor 1:");
        for(int pointer:v1) {
            System.out.print(pointer + " ");
        }

        System.out.println("\nVetor 2:");
        for(int pointer:v2) {
            System.out.print(pointer + " ");
        }
    }
}