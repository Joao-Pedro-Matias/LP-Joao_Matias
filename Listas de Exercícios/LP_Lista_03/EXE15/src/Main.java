import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double money, change;
        int option;

        change = 0;

        System.out.println("Insira o dinheiro:");
        money = in.nextDouble();

        if (money<0.5) System.out.println("Dinheiro insuficiente");
        else {
            if (money<1) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n ------------------------------");
            }
            else if (money<2) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n1. Café Longo R$ 1,00" +
                        "\n ------------------------------");
            }
            else if (money<2.5) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n1. Café Longo R$ 1,00" +
                        "\n3. Chocolate R$ 2,00" +
                        "\n ------------------------------");
            }
            else {
                System.out.println("------------------------------" +
                                "\nMENU:" +
                                "\n1. Café Expresso R$ 0,50" +
                                "\n1. Café Longo R$ 1,00" +
                                "\n3. Chocolate R$ 2,00" +
                                "\n4. Cappuciono R$ 2,50" +
                        "\n ------------------------------");
            }

            System.out.println("Escolha uma opção");
            option = in.nextInt();
            System.out.println("------------------------------");

            switch (option) {
                case 1:
                    System.out.println("Bebida selecionada: Café Expresso");
                    change = money - 0.5;
                    break;
                case 2:
                    System.out.println("Bebida selecionada: Café Longo");
                    change = money - 1;
                    break;
                case 3:
                    System.out.println("Bebida selecionada: Chocolate");
                    change = money - 2;
                    break;
                case 4:
                    System.out.println("Bebida selecionada: Capuccino");
                    change = money - 2.5;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            System.out.println("Seu troco: " + change);

        }

    }
}