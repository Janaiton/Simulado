import java.util.Scanner;

public class Refazendo7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matriz = {
                { 2, 4, 6, 8 },
                { 3, 6, 9, 12 },
                { 5, 10, 15, 20 },
                { 100, 200, 300, 400 },
        };

        System.out.println();

        int somaLinha = 0;

        System.out.println("***Soma linha 1***");
        for (int i = 0; i < matriz.length; i++) {
            somaLinha += matriz[1][i];
            System.out.println("Resultado soma na posição " + (i + 1) + " = " + somaLinha);
        }
        System.out.println("Resultado soma  = " + somaLinha);

        System.out.println();

        System.out.println("***Soma Matriz***");
        for (int i = 0; i < matriz.length; i++) {
            int somaMatriz = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaMatriz += matriz[i][j];
                System.out.println("Resultado soma na posição " + (i + 1) + " = " + somaMatriz);
            }
            System.out.println("\nResultado soma matriz = " + somaMatriz);
        }
        System.out.println();

        int somaDiagonal = 0;

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
            System.out.println("Resultado soma na posição " + (i + 1) + " = " + somaDiagonal);
        }
        System.out.println("\nResultado soma matriz = " + somaDiagonal);

    }
}
