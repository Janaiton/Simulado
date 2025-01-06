import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 1, 3, 5, 7, 9 };
        int[] vetor2 = { 2, 4, 6, 8, 10 };

        int[] vetor3 = new int[10];

        System.out.print("Vetor 1 = { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("}");
        System.out.println();

        System.out.print("Vetor 2 = { ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println(" }");
        System.out.println();

        // * Loop que principal que percorre e une os v1 com v2e define o tamanho de v3
        // */
        for (int i = 0; i < vetor3.length; i++) {
            if (i < vetor.length) {
                vetor3[i] = vetor[i];
            } else {
                vetor3[i] = vetor2[i - vetor.length];
            }
        }

        for (int i = 0; i < vetor3.length; i++) {
            for (int j = i + 1; j < vetor3.length; j++) {
                if (vetor3[i] > vetor3[j]) {
                    int temp = vetor3[i];
                    vetor3[i] = vetor3[j];
                    vetor3[j] = temp;
                }
            }
        }

        System.out.print("Vetores ordenados = { ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.print("}");
        System.out.println();
    }
}
