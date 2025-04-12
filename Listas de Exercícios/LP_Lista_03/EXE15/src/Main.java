import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double money, change;
        int option;

        change = 0;

        System.out.println("Insira o dinheiro: R$");
        money = in.nextDouble();

        if (money<0.5) System.out.println("Dinheiro insuficiente");
        else {
            if (money<1) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n------------------------------");
            }
            else if (money<2) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n2. Café Longo R$ 1,00" +
                        "\n------------------------------");
            }
            else if (money<2.5) {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n2. Café Longo R$ 1,00" +
                        "\n3. Chocolate R$ 2,00" +
                        "\n------------------------------");
            }
            else {
                System.out.println("------------------------------" +
                        "\nMENU:" +
                        "\n1. Café Expresso R$ 0,50" +
                        "\n2. Café Longo R$ 1,00" +
                        "\nn3. Chocolate R$ 2,00" +
                        "\n4. Cappuciono R$ 2,50" +
                        "\n------------------------------");
            }

            System.out.println("Escolha uma opção");
            option = in.nextInt();
            System.out.println("------------------------------");

            switch (option) {
                case 1:
                    System.out.println("Bebida selecionada: Café Expresso");
                    if(money>=0.5) change = money - 0.5;
                    else System.out.println("Saldo Insuficiente");
                    break;
                case 2:
                    System.out.println("Bebida selecionada: Café Longo");
                    if(money>=1) change = money - 1;
                    else System.out.println("Saldo Insuficiente");
                    break;
                case 3:
                    System.out.println("Bebida selecionada: Chocolate");
                    if(money>=2) change = money - 2;
                    else System.out.println("Saldo Insuficiente");
                    break;
                case 4:
                    System.out.println("Bebida selecionada: Capuccino");
                    if(money>=2.5) change = money - 2.5;
                    else System.out.println("Saldo Insuficiente");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            System.out.println("------------------------------" +
                    "\nSeu troco: R$" +  String.format("%.2f", change) +
                    "\n------------------------------");

        }

    }
}