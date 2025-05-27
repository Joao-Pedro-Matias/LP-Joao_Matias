import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name, lastName;
        int age;
        int [] array = {0,1,2,3};

        System.out.println("Seu nome:");
        name = in.next();
        System.out.println("Sobrenome:");
        lastName = in.next();
        System.out.println("Sua idade:");
        age = in.nextInt();

        printMenu(name, lastName, age, array);

    }

    public static void printMenu(String nome, String sobrenome, int idade, int [] vetor) {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);

        for (int pointer:vetor) {
            System.out.print(pointer + ", ");
        }

        int [] vetor1 = invertArray(vetor);
        System.out.println(" ");;

        for (int pointer:vetor1) {
            System.out.print(pointer + ", ");
        }


    }

    public static int [] invertArray(int [] vetor) {
        int aux=0;

        for (int i=0; i<vetor.length/2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length-i-1];
            vetor[vetor.length-i-1] = aux;

        }

        return vetor;
    }

}