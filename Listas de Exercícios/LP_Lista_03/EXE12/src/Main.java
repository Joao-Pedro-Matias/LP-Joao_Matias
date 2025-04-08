import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, result=0;
        int option;

        System.out.println("Digite os dois números separdos por espaço");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("------------------------------" +
                "\nMENU:" +
                "\n1. Soma" +
                "\n2. Subtracao" +
                "\n3. Multiplicacao" +
                "\n4. Divisao" +
                "\n------------------------------" +
                "\n Escolha uma opcção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.println("------------------------------" +
                "\nResultado: " + result +
                "\n------------------------------");



    }
}