import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor1, valor2;

        System.out.println(" Insira os valores!");
        System.out.print(" Valores 1 = ");
        valor1 = in.nextInt();
        System.out.print(" Valore 2 = ");
        valor2 = in.nextInt();

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                if (i == 0 || i == valor1 - 1 || j == 0 || j == valor2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
