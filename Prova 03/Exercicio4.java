import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[0];
        int valor = 0;

        int par = 0;
        int impar = 0;

        do {
            int[] novoVetor = new int[vetor.length + 1];

            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            System.out.print("\nValor  = ");
            valor = in.nextInt();

            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            novoVetor[novoVetor.length - 1] = valor;
            vetor = novoVetor;

            System.out.print("\nVetor = ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();

            int[] pares = new int[par];
            int[] impares = new int[impar];

            int indicePar = 0;
            int indiceImpar = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0) {
                    pares[indicePar] = vetor[i];
                    indicePar++;
                } else {
                    impares[indiceImpar] = vetor[i];
                    indiceImpar++;
                }
            }
            for (int i = 0; i < pares.length; i++) {
                for (int j = i + 1; j < pares.length; j++) {
                    if (pares[i] > pares[j]) {
                        int temp = pares[i];
                        pares[i] = pares[j];
                        pares[j] = temp;
                    }
                }
            }
            for (int i = 0; i < impares.length; i++) {
                for (int j = i + 1; j < impares.length; j++) {
                    if (impares[i] < impares[j]) {
                        int temp = impares[i];
                        impares[i] = impares[j];
                        impares[j] = temp;
                    }
                }
            }

            System.out.println();
            System.out.print("Pares = ");
            for (int i = 0; i < pares.length; i++) {
                System.out.print(pares[i] + " ");
            }
            System.out.println();

            System.out.print("Impares = ");
            for (int i = 0; i < impares.length; i++) {
                System.out.print(impares[i] + " ");
            }
            System.out.println();

        } while (true);
    }

}
