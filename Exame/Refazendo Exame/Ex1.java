import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Valor = ");
        int valor = in.nextInt();

        for (int i = valor; i > 0; i--) {
            for (int j = i - 1; j < valor; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}