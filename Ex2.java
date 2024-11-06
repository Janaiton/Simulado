import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;
        int valor;
        int positivo = 0;
        int negativo = 0;

        do {
            System.out.print(" Digite um número = ");
            valor = in.nextInt();

            if (valor == 0) {
                System.out.println("Número não permitido!");
                break;
            } else if (valor < 0) {
                System.out.println("Número negativo!");
                negativo++;
            } else {
                System.out.println("Número positivo");
                positivo++;
            }

        } while (n <= valor || n > valor);

        System.out.println(" Números positivos = " + positivo);
        System.out.println(" Números negativo = " + negativo);

    }

}
