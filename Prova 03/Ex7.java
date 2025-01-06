import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matriz = {
                { 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 12, 13 },
                { 14, 15, 16, 17 },
        };

        System.out.println();
        System.out.println("Mostra da soma da linha 2.");
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[1][i];
            System.out.println("Posição " + (i + 1) + " = " + soma);
        }
        System.out.println("\nResultado soma linha 2 = " + soma);

        System.out.println();
        System.out.println("Mostra da soma da coluna 1.");
        int somaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][0];
            System.out.println("Posição " + (i + 1) + " = " + somaColuna);
        }
        System.out.println("\nResultado soma coluna 1 = " + somaColuna);

        System.out.println();
        System.out.println("Mostra da soma da coluna 3.");
        int somaColuna3 = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna3 += matriz[i][2];
            System.out.println("Posição " + (i + 1) + " = " + somaColuna3);
        }
        System.out.println("\nResultado soma coluna 3 = " + somaColuna3);

        System.out.println();
        System.out.println("Mostra da soma da diagonal.");
        int diagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal += matriz[i][i];
            System.out.println("Posição " + (i + 1) + " = " + diagonal);
        }
        System.out.println("\nResultado soma diagonal = " + diagonal);

        System.out.println();
        int somaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaMatriz += matriz[i][j];
                System.out.println("Posição " + (i + 1) + "." + (j + 1) + " = " + somaMatriz);
            }
        }
        System.out.println("\nResultado soma diagonal = " + somaMatriz);

    }
}
