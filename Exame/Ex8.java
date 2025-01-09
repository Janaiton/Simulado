import java.util.Scanner;
import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[12][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(30);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSoma mês");
        for (int i = 0; i < matriz.length; i++) {
            int somaMes = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaMes += matriz[i][j];
            }
            System.out.println("Mês " + (i + 1) + " = " + somaMes);
        }

        System.out.println("\nSoma semana");
        for (int j = 0; j < matriz[0].length; j++) {
            int somaSemana = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaSemana += matriz[i][j];
            }
            System.out.println("Semana " + (j + 1) + " = " + somaSemana);
        }

        int somaAno = 0;

        System.out.println("\nSoma ano");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaAno += matriz[i][j];
            }
        }
        System.out.println("Ano  = " + somaAno);

    }

}
