import java.util.Scanner;

public class Jogando {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] v1 = new int[0];
        int valor = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {

            int[] v2 = new int[v1.length + 1];

            for (int i = 0; i < v1.length; i++) {
                v2[i] = v1[i];
            }

            System.out.print("Valor = ");
            valor = in.nextInt();

            v2[v2.length - 1] = valor;
            v1 = v2;

            for (int i = 0; i < v1.length; i++) {
                for (int j = 0; j < v1.length; j++) {
                    if (v1[i] < v1[j]) {
                        int temp = v1[i];
                        v1[i] = v1[j];
                        v1[j] = temp;
                    }
                }
            }

            System.out.print("Vetor = {");
            for (int i = 0; i < v1.length; i++) {
                System.out.print(v1[i] + " ");
            }
            System.out.print(" }");
            System.out.println();

            for (int i = 0; i < v1.length; i++) {
                if (v1[i] < menor) {
                    menor = v1[i];
                }
            }
            for (int i = 0; i < v1.length; i++) {
                if (v1[i] > maior) {
                    maior = v1[i];
                }
            }

            System.out.println("Menor = " + menor);
            System.out.println("Maior = " + maior);

        } while (true);
    }
}
