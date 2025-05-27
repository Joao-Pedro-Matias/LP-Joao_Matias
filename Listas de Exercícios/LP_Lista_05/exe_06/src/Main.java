public class Main {
    public static void main(String[] args) {

        int [] numbers = {0,1,2,3,4,5,6,7,8,9,10};

        int n=0;

        for(int pointer:numbers) System.out.print(pointer + " ");

        for (int i= numbers.length-1; i>=numbers.length/2; i--) {
            n = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = n;

        }

        System.out.printf("\n");
        for(int pointer:numbers) System.out.print(pointer + " ");
    }
}