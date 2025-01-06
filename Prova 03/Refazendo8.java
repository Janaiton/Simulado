import java.util.Scanner;
import java.util.Random;

public class Refazendo8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Numero de linhas = ");
        int linha = in.nextInt();

        System.out.print("Numero de colunas = ");
        int coluna = in.nextInt();

        int[][] matriz = new int[linha][coluna];

        int valor = 0;

        System.out.println();
        System.out.println("***Matriz Normal***");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valor = random.nextInt(50);
                matriz[i][j] = valor;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[][] pares = new int[linha][coluna];

        System.out.println();
        System.out.println("***Mostrando como matriz***");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Mostrando como vetor = ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

    }
}
