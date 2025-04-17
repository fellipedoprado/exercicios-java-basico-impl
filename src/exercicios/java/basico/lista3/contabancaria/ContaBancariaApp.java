package exercicios.java.basico.lista3.contabancaria;

import java.util.Scanner;

public class ContaBancariaApp {
    public static void executar(Scanner scanner) {
        System.out.println("Criação da Conta Bancária");
        System.out.print("Informe o valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;
        do {
            System.out.println("\n--- Menu Conta Bancária ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial disponível");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso de cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case 2:
                    double chequeDisponivel = conta.getChequeEspecial() - conta.getChequeUsado();
                    System.out.printf("Cheque especial disponível: R$ %.2f\n", chequeDisponivel);
                    break;
                case 3:
                    System.out.print("Valor para depositar: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.print("Valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente incluindo cheque especial!");
                    }
                    break;
                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;
                case 6:
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("Você está usando o cheque especial.");
                    } else {
                        System.out.println("Você não está usando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
