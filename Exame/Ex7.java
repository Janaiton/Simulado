import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Tamanho = ");
        int tamanho = in.nextInt();

        char[][] matriz = new char[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = '1';
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
