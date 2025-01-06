import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int valor = 0;

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            valor = in.nextInt();

            boolean existe = false;

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == valor) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("Repetido !! Digita novamente abobado!");
                i--;
            } else {
                vetor[i] = valor;
            }
        }
        System.out.println();

        System.out.print("Vetor = { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("}");
        System.out.println();
    }
}