public class Main {
    public static void main(String[] args) {

        int [] [] numbers = {{5,1,2,3,4},
                             {0,6,2,3,4},
                             {0,1,7,3,5},
                             {0,1,2,8,4},
                             {0,1,2,3,9}};
        int i=1, j=1;

        for (int [] line:numbers){
            for(int column:line){
                if (i == j) System.out.print(column + " ");
                i++;
            }
            j++;
            i=1;
        }



    }
}