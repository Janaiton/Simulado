import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];
        String[] candidatos = { "João", "Antonio", "Roberto", "Janaiton", "Gonçalo" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + " = " + candidatos[i]);
        }
        System.out.println("Sair = -1");

        while (true) {

            System.out.print("\nVoto = ");
            int voto = in.nextInt();

            if (voto == -1) {
                System.out.println("Sair");
                break;
            }

            if (voto < 1 || voto > 5) {
                System.out.println("Invalido");
                continue;
            }

            vetor[voto - 1]++;
            System.out.println("Voto para = " + candidatos[voto - 1]);
        }

        System.out.println("\nResultado da votação");
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(candidatos[i] + ":" + vetor[i] + " votos");
        }

        int indiceVencedor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceVencedor]) {
                indiceVencedor = i;
            }
        }
        System.out.println("\nVencedor = " + candidatos[indiceVencedor] + " com " + vetor[indiceVencedor] + " votos");

    }
}