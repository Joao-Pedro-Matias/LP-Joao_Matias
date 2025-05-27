import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int base, power;

        System.out.println("Digite o valor da base:");
        base = in.nextInt();

        System.out.println("Digite o valor do expoente:");
        power = in.nextInt();

        int result = calculateNumbers(base, power);

        if (power<0) System.out.println("Resultado: 1/" + result);
        else System.out.println("Resultado: " + result);

    }

    /* public static int calculateNumbers(int base, int power){
        int aux = base;
        if(power>=0)
            for (int i=2; i<=power; i++)aux *= base;
        else
            for (int i=power; i<-1; i++)aux *= base;
        return aux;
    } */

    public static int calculateNumbers(int base, int power){
        if (power==0)
            return 1;

        if (power>0);
        else
            power *= -1;

        if (power == 1)
            return base;
        return base * calculateNumbers(base, power - 1);

    }
}