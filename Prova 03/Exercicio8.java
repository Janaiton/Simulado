import java.util.Scanner;
import java.util.Random;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int linha = 0;
        int coluna = 0;

        System.out.print("Quantas linhas = ");
        linha = in.nextInt();

        System.out.print("Quantas colunas = ");
        coluna = in.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maior = 0;

        int[] maiores = new int[linha];

        for (int i = 0; i < matriz.length; i++) {
            maior = matriz[i][0];
            for (int j = 1; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiores[i] = maior;
        }
        System.out.println();
        for (int i = 0; i < maiores.length; i++) {
            System.out.print(maiores[i] + " ");
        }
        System.out.println();

    }

}
