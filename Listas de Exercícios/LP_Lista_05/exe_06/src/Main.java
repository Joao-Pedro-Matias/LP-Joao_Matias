public class Main {
    public static void main(String[] args) {

        int [] numbers = {0,1,2,3,4,5,6,7,8,9,10};

        int number=0, j=0;

        for(int pointer:numbers) System.out.print(pointer + " ");

        for (int i= numbers.length-1; i>numbers.length/2; i--) {
            number = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = number;
            j++;
        }

        System.out.printf("\n");
        for(int pointer:numbers) System.out.print(pointer + " ");
    }
}