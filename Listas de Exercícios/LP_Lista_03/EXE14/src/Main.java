import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double value,disc, tax;
        int option, parc;

        disc = 0;
        tax = 0;

        System.out.println("Informe o Valor da compra: ");
        value = in.nextDouble();

        System.out.println("------------------------------" +
                "\nMENU:" +
                "\n1. Débito" +
                "\n2. Pix" +
                "\n3. Crédito" +
                "\n------------------------------" +
                "\n Escolha uma opcção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("------------------------------" +
                        "\nDébito selecionado");
                disc = value * 0.05;

                break;

            case 2:
                System.out.println("------------------------------" +
                        "\nPix selecionado");
                disc = value * 0.1;

                break;

            case 3:
                System.out.println("------------------------------" +
                        "\nCrédito selecionado");
                System.out.println("------------------------------" +
                        "\nInforme a quantidade de parcelas:");
                parc = in.nextInt();

                if (parc<=4) tax = value * 0.02;
                else tax = value * 0.05;

                break;

            default:
                System.out.println("Opção Inválida");

        }

        value = value - disc + tax;
        System.out.println("------------------------------" +
                "\n O valor a ser pago é: " + value +
                "\n------------------------------");
    }
}