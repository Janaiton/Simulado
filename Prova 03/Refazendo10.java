import java.util.Scanner;

public class Refazendo10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Linha = ");
        int linha = in.nextInt();

        System.out.print("Coluna = ");
        int coluna = in.nextInt();

        char[][] matriz = new char[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || j == 0 || i == j || i == coluna - j - 1 || i == linha - 1 || j == coluna - 1) {
                    matriz[i][j] = 'x';
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
