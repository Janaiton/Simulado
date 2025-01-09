import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Numero de 0 a 1000");

        for (int i = 1; i < 1000; i++) {
            int divisor = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisor += j;
                }
            }
            if (divisor == i) {
                System.out.println("Perfeito = " + i);
            }
        }
    }
}
