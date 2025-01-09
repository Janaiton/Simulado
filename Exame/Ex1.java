import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Tamanho do triângulo = ");
        int tamanho = in.nextInt();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}