import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] v1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] v2 = new int[10];

        v2 = v1;

        System.out.println("Mostra como tabela");
        for (int i = 1; i < 10; i++) {
            v2[i] = v2[i - 1] + v1[i];
            System.out.println("Posição " + i + " = " + v2[i]);
        }
        System.out.println();

        System.out.print("Mostrar como vetor = { ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.print(" }");
        System.out.println();
    }
}
