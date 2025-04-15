import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double fah=0;

        for (int i=-80; i<=80; i+=10){
            fah=(1.8*i)+32;
            System.out.println(i + "° Celsius = " + fah +"° Fahreinheit");
        }

    }
}