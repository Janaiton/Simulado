import java.util.Scanner;

public class Refazendo6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 1 };

        System.out.print("Tamanho = ");
        int tamanho = in.nextInt();

        for (int i = 0; i < tamanho; i++) {
            int[] novoVetor = new int[vetor.length + 1];
            novoVetor[0] = vetor[0];
            novoVetor[novoVetor.length - 1] = vetor[vetor.length - 1];

            for (int j = 1; j < novoVetor.length - 1; j++) {
                novoVetor[j] = vetor[j - 1] + vetor[j];
            }

            vetor = novoVetor;

            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }
            System.out.println();
        }

    }
}
