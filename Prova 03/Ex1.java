import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int valor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor = ");
            valor = in.nextInt();

            boolean existe = false;

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == valor) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("Novamente");
                i--;
            } else {
                vetor[i] = valor;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}