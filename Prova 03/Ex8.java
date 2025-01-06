import java.util.Scanner;
import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // *definir quantas linhas e quantas colunas */
        int linha = 0;
        int coluna = 0;

        System.out.print("Linha = ");
        linha = in.nextInt();

        // *local para digitar a quantidades */
        System.out.print("Coluna = ");
        coluna = in.nextInt();

        // *declara a matris com os valore das linhas e colunas */
        int[][] matriz = new int[linha][coluna];

        // *lê a matriz e o random da os valore aleatórios */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(30);
            }
        }

        // *mostra a matriz com os valores aleatórios */
        System.out.println("\nMatriz com valores aleatórios");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // *declara o vetor maior */
        int[] maiores = new int[linha];

        // *percorre a matriz separando os maiores valores da matriz */
        for (int i = 0; i < matriz.length; i++) {

            // *declarou a variavel para receber o maior valore */
            int maior = matriz[i][0];
            for (int j = 1; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            // *o vetor maior recebe o valor */
            maiores[i] = maior;
        }

        // *mostra o maior valor */
        System.out.println();
        for (int i = 0; i < maiores.length; i++) {
            System.out.println("Posição " + (i + 1) + " = " + maiores[i]);
        }
    }

}
