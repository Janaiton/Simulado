import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor1 = { 1, 3, 5, 7, 9 };
        int[] vetor2 = { 2, 4, 6, 8, 10 };

        int[] vetor3 = new int[vetor1.length + vetor2.length];

        System.out.print("Vetor 1 = ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 2 = ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetor3.length; i++) {
            if (i < vetor1.length) {
                vetor3[i] = vetor1[i];
            } else {
                vetor3[i] = vetor2[i - vetor1.length];
            }
        }

        for (int i = 0; i < vetor3.length; i++) {
            for (int j = 0; j < vetor3.length; j++) {
                if (vetor3[i] < vetor3[j]) {
                    int aux = vetor3[i];
                    vetor3[i] = vetor3[j];
                    vetor3[j] = aux;
                }
            }
        }

        System.out.print("Vetor 3 = ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    }

}
