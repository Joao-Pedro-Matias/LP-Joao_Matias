public class Main {
    public static void main(String[] args) {

        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        int test, numberPrint=0;

        for (int pointer:numbers) {
            test = pointer % 2;
            if (test==0) numberPrint = pointer + 2;
            else numberPrint = pointer * 2;
            System.out.print(numberPrint + " ");
        }
    }
}