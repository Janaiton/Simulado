import java.util.Scanner;
import java.util.Random;

public class Ex6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[5][5];

        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(30);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Escolha um valor = ");
        int valor = in.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            int somalinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somalinha += matriz[i][j];
                System.out.println(somalinha);
            }
            if (somalinha == valor) {
                System.out.println("Linha " + (i + 1) + " tem a soma " + somalinha);
            } else {
                System.out.println("Não encontrei");
            }
        }

    }
}
