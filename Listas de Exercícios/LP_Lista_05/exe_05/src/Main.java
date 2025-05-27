public class Main {
    public static void main(String[] args) {

        int [] v1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, v2 = new int[v1.length];

        for(int i=v1.length-1; i>=0; i--) {
            v2[(v1.length-1)-i] = v1[i];
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