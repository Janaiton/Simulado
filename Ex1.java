import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\n Mostrar números de 1 a 10\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(" Número = " + i);
        }

        System.out.println("\n Mostrar números de 20 a 10\n");

        for (int i = 20; i >= 10; i--) {
            System.out.println(" Número = " + i);
        }

        System.out.println("\n Mostrar números pares de 30 a 50\n");

        for (int i = 30; i <= 50; i = i + 2) {
            System.out.println(" Número = " + i);
        }

        System.out.println("\n Mostrar números impares de 100 a 120\n");

        for (int i = 100 + 1; i <= 120; i = i + 2) {
            System.out.println(" Número = " + i);
        }
    }
}