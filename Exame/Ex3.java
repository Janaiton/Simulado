import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5, 4, 3, 5, 1, 1 };

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int quantmaior = 0;
        int quantmenor = 0;

        System.out.print("Vetor = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                quantmaior = 1;
            } else if (vetor[i] == maior) {
                quantmaior++;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                quantmenor = 1;
            } else if (vetor[i] == menor) {
                quantmenor++;
            }
        }
        System.out.println(maior + " é o maior valor, e repete " + quantmaior + " vezes");
        System.out.println(menor + " é o menor valor, e repete " + quantmenor + " vezes");

    }
}