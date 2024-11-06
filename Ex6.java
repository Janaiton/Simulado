import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 1000;
        int valor, resto, dezena, resultado;

        System.out.print(" Insira um valor com 4 algoritmos = ");
        valor = in.nextInt();

        dezena = valor % 100;
        valor = valor / 100;
        resultado = (dezena + valor);
        resultado = resultado * resultado;

        System.out.println(valor);
        System.out.println(dezena);
        System.out.println(resultado);

        while (n <= 9999) {
            dezena = valor % 100;
            valor = valor / 100;
            resultado = (dezena + valor);
            resultado = resultado * resultado;

            if (resultado == n) {
                System.out.println(n);
            }
        }

    }

}
