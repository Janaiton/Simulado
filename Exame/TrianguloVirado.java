import java.util.Scanner;

public class TrianguloVirado {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Tamanho do triângulo = ");
        int tamanho = in.nextInt();

        for (int i = tamanho; i > 0; i--) {
            for (int j = i - 1; j < tamanho; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
