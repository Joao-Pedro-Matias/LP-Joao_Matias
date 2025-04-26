public class Main {
    public static void main(String[] args) {

        int [] [] numbers = {{5,1,2,3,9},
                             {0,6,2,8,4},
                             {0,1,7,3,5},
                             {0,6,2,8,4},
                             {5,1,2,3,9}};

        int i=1, j=1, n= numbers.length;

        for (int [] line:numbers){
            for(int column:line){
                if ((i+j) == (n+1)) System.out.print(column + " ");
                i++;
            }
            j++;
            i=1;
        }


    }
}