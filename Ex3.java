import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;
        int escolha, sim = 1, nao = 0;
        int opcao = 0, deposito = 1, sacar = 2, sair = 3;
        double conta = 0, valor;

        do {

            System.out.println(" Olá prezado cliente escolha uma opção!" +
                    "\n\t 1 = deposito\n\t 2 = sacar\n\t 3 = sair");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.print("Quanto você deseja depositar = ");
                valor = in.nextDouble();
                conta = conta + valor;

                System.out.println(" Deseja continuar? " + "\n\t 1 = continuar\n\t 0 = sair");
                escolha = in.nextInt();
                if (escolha == 1) {
                    System.out.println(" Vamos continuar!");
                } else {
                    break;
                }
            } else if (opcao == 2) {
                System.out.println("Quanto você deseja sacar?");
                valor = in.nextDouble();
                conta = conta - valor;
                if (valor > conta) {
                    System.out.println(" Saldo insuficiente!");
                    break;
                }

                System.out.println(" Deseja continuar? " + "\n\t 1 = continuar\n\t 0 = sair");
                escolha = in.nextInt();
                if (escolha == 1) {
                    System.out.println(" Vamos continuar!");
                } else {
                    break;
                }
            } else {
                System.out.println(" Você escolheu sair!");
                break;
            }

            System.out.println(" Seu saldo = " + conta + " reais");

        } while (n <= opcao);
    }

}
