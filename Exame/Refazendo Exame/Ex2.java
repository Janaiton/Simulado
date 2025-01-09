import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 1000; i++) {
            int soma = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }
            if (soma == i) {
                System.out.println("Perfect number = " + i);
            }
        }

    }
}
