import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5, 4, 3, 5, 1, 1 };
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int quantidadeMaior = 0;
        int quantidadeMenor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                quantidadeMaior = 1;
            } else if (vetor[i] == maior) {
                quantidadeMaior++;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                quantidadeMenor = 1;
            } else if (vetor[i] == menor) {
                quantidadeMenor++;
            }
        }
        System.out.println("O menor numero é " + menor + " e repetiu " + quantidadeMenor + " vezes");
        System.out.println("O menor numero é " + maior + " e repetiu " + quantidadeMaior + " vezes");
    }
}
