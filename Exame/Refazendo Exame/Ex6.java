import java.util.Scanner;
import java.util.Random;

public class Ex6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[5][5];

        System.out.println("\nMatriz\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(40);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        do {
            System.out.print("Valor = ");
            int valor = in.nextInt();

            for (int i = 0; i < matriz.length; i++) {
                int soma = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    soma += matriz[i][j];
                }
                if (soma == valor) {
                    System.out.println(valor + "encontrado. Posição " + (i + 1));
                } else {
                    System.out.println("Não encontrou na linha");
                }
            }

            for (int j = 0; j < matriz[0].length; j++) {
                int soma = 0;
                for (int i = 0; i < matriz.length; i++) {
                    soma += matriz[i][j];
                }
                if (soma == valor) {
                    System.out.println(valor + "encontrado. Posição " + (j + 1));
                } else {
                    System.out.println("Não encontrou na coluna");
                }
            }

        } while (true);
    }

}
