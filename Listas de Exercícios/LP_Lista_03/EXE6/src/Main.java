import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Digite o numero do menu: ");
        number = in.nextInt();

        if(number<=9 && number>=5) System.out.println("Opção escolhida: " + number);
        else System.out.println("Opção Inválida");
    }
}