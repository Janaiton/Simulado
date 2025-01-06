import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int valor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor posição " + (i + 1) + " = ");
            valor = in.nextInt();
            vetor1[i] = valor;
        }

        System.out.print("\nVetor = ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[i];
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.println();
        for (int i = 1; i < vetor2.length; i++) {
            vetor2[i] = vetor2[i - 1] + vetor1[i];
            System.out.println("Posição " + (i + 1) + " = " + vetor2[i]);
        }
        System.out.print("\nVetor = ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

    }
}