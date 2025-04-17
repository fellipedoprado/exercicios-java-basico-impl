package exercicios.java.basico.lista3;

import exercicios.java.basico.lista3.carro.CarroApp;
import exercicios.java.basico.lista3.contabancaria.ContaBancariaApp;
import exercicios.java.basico.lista3.petshop.PetShopApp;
import java.util.Scanner;


public class Lista3 {
    public static void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Lista 3 ---");
            System.out.println("1 - Conta Bancaria");
            System.out.println("2 - Carro");
            System.out.println("3 - PetShop");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    ContaBancariaApp.executar(scanner);
                }
                case 2 -> {
                    CarroApp.executar(scanner);
                }
                case 3 -> {
                    PetShopApp.executar(scanner);
                }
                case 0 -> {
                    continuar = false;
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}
