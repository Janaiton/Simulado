import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matriz = {
                { 2, 4, 7, 9 },
                { 11, 13, 17, 20 },
                { 23, 27, 29, 31 },
                { 34, 50, 53, 60 },
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaLinha = 0;

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            somaLinha += matriz[1][i];
            System.out.println("Posição " + (i + 1) + " = " + somaLinha);
        }
        System.out.println("\nResultado soma da linha 2 = " + somaLinha);

        int somaColuna = 0;

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][2];
            System.out.println("Posição " + (i + 1) + " = " + somaColuna);
        }
        System.out.println("\nResultado soma da coluna 1= " + somaColuna);

        int somaDiagonal = 0;

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
            System.out.println("Posição " + (i + 1) + " = " + somaDiagonal);
        }
        System.out.println("\nResultado da soma da diagonal = " + somaDiagonal);

        int somaMatriz = 0;

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaMatriz += matriz[i][j];
                System.out.println("Posição " + (i + 1) + "." + (j + 1) + " = " + somaMatriz);
            }
        }
        System.out.println("\nResultado da soma da matriz = " + somaMatriz);
    }

}
