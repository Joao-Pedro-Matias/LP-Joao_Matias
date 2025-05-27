import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word;

        System.out.println("Escreva uma palavra: ");
        word = in.next();

        word.replaceAll("[^A-Za-z0-9]","");

        char[] letters = word.toCharArray();


        int result = verPalindromo(letters, 0, 1);

        System.out.print(Arrays.toString(letters));

        if (result == 1) System.out.println(" É um palíndromo");
        else System.out.println(" Não é um palíndromo");


    }
    /* public static int verPalindromo(char [] letters) {
        int aux =1;

        for (int i=0; i <= letters.length/2; i++ ){
            if (letters[i] == letters[letters.length-i-1]);
            else aux *= 0;
        }
        return aux;
    } */

    public static int verPalindromo(char [] letters, int aux, int i) {

        if(aux>=letters.length) return i;

        if (letters[aux] == letters[letters.length-aux-1]);
        else i *= 0;

        aux ++;

        return verPalindromo(letters, aux, i);

    }
}