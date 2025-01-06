import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tamanho = 0;

        System.out.print("Tamanho da matriz = ");
        tamanho = in.nextInt();

        char[][] matriz = new char[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || j == 0 || i == tamanho - 1 ||
                        i == tamanho - j - 1 || j == tamanho - 1 || i == j) {
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = '0';
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
