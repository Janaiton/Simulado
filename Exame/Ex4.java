import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] votos = new int[5];
        String[] candidatos = { "Paulo", "João", "Rodrigo", "Marcelo", "Roberto" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + " = " + candidatos[i]);
        }

        while (true) {

            int candidato = in.nextInt();

            if (candidato == 0) {
                System.out.println("Fim da votação");
                break;
            }

            if (candidato < 1 || candidato > 5) {
                System.out.println("Novamente");
                continue;
            }

            votos[candidato - 1]++;
            System.out.println("Voto para " + candidatos[candidato - 1]);

        }

        System.out.println("Resultado da votação");
        for (int i = 0; i < votos.length; i++) {
            System.out.println(candidatos[i] + ":" + votos[i] + " votos");
        }

        int indiceVencedor = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }
        System.out
                .println("\nO vencedor é: " + candidatos[indiceVencedor] + " com " + votos[indiceVencedor] + " votos.");
    }
}
