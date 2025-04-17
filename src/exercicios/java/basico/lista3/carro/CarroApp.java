package exercicios.java.basico.lista3.carro;

import java.util.Scanner;

public class CarroApp {
    public static void executar(Scanner scanner) {
        Carro carro = new Carro();
        int opcao;
        do {
            System.out.println("\n--- Menu do Carro ---");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar esquerda");
            System.out.println("6. Virar direita");
            System.out.println("7. Verificar velocidade");
            System.out.println("8. Trocar marcha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> carro.virar("esquerda");
                case 6 -> carro.virar("direita");
                case 7 -> carro.verificarVelocidade();
                case 8 -> {
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }
}
