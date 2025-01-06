import java.util.Random;
import java.util.Scanner;;

public class Ex9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Linha = ");
        int linha = in.nextInt();
        System.out.print("Coluna = ");
        int coluna = in.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(35);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Qual valor você procura = ");
        int procura = in.nextInt();

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                if (soma == procura) {
                    System.out.println("Posição " + (i + 1) + "." + (j + 1) + " = " + soma);
                }
            }
        }
    }
}
