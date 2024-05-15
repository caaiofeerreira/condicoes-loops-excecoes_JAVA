package desafios.OperacoesBancarias;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean loop = true;

        while (loop) {

            int opcao = scanner.nextInt();
            switch (opcao ) {
                case 1:
                    saldo = saldo + scanner.nextDouble();
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:

                    double valorDesejado =  scanner.nextDouble();
                    if(saldo < valorDesejado)
                        System.out.println("Saldo insuficiente.");
                    else {
                        saldo = saldo - valorDesejado;
                        System.out.println("Saldo atual: "+saldo);
                    }
                    loop = false;
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println("Programa encerrado.");
    }
}