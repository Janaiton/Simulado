import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inicio, razao, soma, multiplicacao;
        int opcao, pg = 1, pa = 2;

        System.out.println(" Escolha qual tipo de progressão !" +
                "\n\t 1 = Pregressão geométrica \n\t 2 = Pregressão aritmética");
        opcao = in.nextInt();

        System.out.println(" Agora informe os valores\n");
        System.out.print(" Inicial = ");
        inicio = in.nextInt();
        System.out.print(" Razão = ");
        razao = in.nextInt();

        for (int i = inicio; i <= 10; i = i + razao) {
            if (opcao == 1) {
                multiplicacao = inicio + i;
                System.out.println(multiplicacao);
            } else {
                soma = inicio * i;
                System.out.println(soma);
            }
        }
    }

}
