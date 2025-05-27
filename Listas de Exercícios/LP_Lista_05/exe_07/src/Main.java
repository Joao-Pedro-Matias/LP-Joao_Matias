public class Main {
    public static void main(String[] args) {

        int [] [] numbers = {{0,1,2,3,4},
                            {0,1,2,3,4},
                            {0,1,2,3,5},
                            {0,1,2,3,4},
                            {0,1,2,3,4}};

        int line=0, lineBigger=0, linePointer=0;


        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[1].length; j++){
                line = line + numbers[i][j];
                if (line>lineBigger){
                    lineBigger = line;
                    linePointer = i;
                }
            }
            line = 0;
        }
        System.out.println("A maior linha é a linha " + (linePointer+1) + " com o valor = " + lineBigger);
        lineBigger =0;

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[1].length; j++){
                line += numbers[j][i];
                if (line>lineBigger){
                    lineBigger = line;
                    linePointer = i;
                }
            }
            line = 0;
        }
        System.out.println("A maior coluna é a coluna " + (linePointer+1) + " com o valor = " + lineBigger);
    }
}