import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("NÚMEROS DIVISÍVEIS POR 4 ATÉ 200");
        System.out.println("---------------------------------");

        for(int i=4; i<=200; i+=4) System.out.println(i);

        System.out.println("---------------------------------");
    }
}