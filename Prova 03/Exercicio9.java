import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(33);
            }
        }

        System.out.println("\nMatriz = ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        boolean existe = false;

        System.out.print("\nValor = ");
        int valor = in.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                if (soma == valor) {
                    existe = true;
                    System.out.println("Na posição " + (i + 1) + "." + (j + 1) + " existe " + soma);
                }
            }
        }
    }
}