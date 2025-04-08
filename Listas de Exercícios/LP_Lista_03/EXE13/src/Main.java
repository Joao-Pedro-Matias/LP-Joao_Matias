import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int option;
        double  radius, perimeter, area, height, width, hypo;

        perimeter=0;
        area=0;

        System.out.println("------------------------------" +
                "\nMENU:" +
                "\n1. Círculo" +
                "\n2. Triangulo Retângulo" +
                "\n3. Retângulo" +
                "\n------------------------------" +
                "\n Escolha uma opcção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("------------------------------"+
                        "\nINFORME" +
                        "\n O raio:");
                radius = in.nextDouble();

                perimeter = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;

                break;

            case 2:
                System.out.println("------------------------------"+
                        "\nINFORME" +
                        "\n A altura:");
                height = in.nextDouble();

                System.out.println(" A base:");
                width = in.nextDouble();

                hypo = (height*height) + (width*width);
                hypo = Math.sqrt(hypo);

                perimeter = height + width + hypo;
                area = (height * width) / 2;

                break;

            case 3:
                System.out.println("------------------------------"+
                        "\nINFORME" +
                        "\n A altura:");
                height = in.nextDouble();

                System.out.println(" A base:");
                width = in.nextDouble();

                perimeter = (2*height) + (2*width);
                area = height * width;
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
        System.out.println("------------------------------" +
                "\nPerímetro: " + perimeter +
                "\nÁrea: " + area +
                "\n------------------------------");
    }
}