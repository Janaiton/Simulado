import java.util.Scanner;
import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[12][4];

        System.out.println("\nMatriz\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(40);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSoma do mês\n");
        for (int i = 0; i < matriz.length; i++) {
            int somaMes = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaMes += matriz[i][j];
            }
            System.out.println((i + 1) + " = " + somaMes);
        }

        System.out.println("\nSoma semanas do Ano\n");
        for (int i = 0; i < matriz.length; i++) {
            int somaSemanaAno = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaSemanaAno += matriz[i][j];
            }
            System.out.println("Semana " + (i + 1) + " = " + somaSemanaAno);
        }

        int somaAno = 0;

        System.out.println("\nSoma do Ano\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaAno += matriz[i][j];
            }
            System.out.println((i + 1) + " = " + somaAno);
        }
        System.out.println("Soma total = " + somaAno);

    }
}