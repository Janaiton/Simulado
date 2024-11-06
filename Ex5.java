import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double soma = 0;
        double impar = 1;
        double divisao;

        for (int i = 0; i < 10000000; i++) {
            divisao = 1 / impar;

            if (i % 2 == 0)
                soma = soma + divisao;
            else
                soma = soma - divisao;

            impar = impar + 2;
        }

        soma = soma * 4;
        System.out.println(" Aproximação de PI =  " + soma);
    }
}
