package exercicios.java.basico.lista3.petshop;

import java.util.Scanner;

public class PetShopApp {
    public static void executar(Scanner scanner) {
        MaquinaBanho maquina = new MaquinaBanho();
        int opcao;

        do {
            System.out.println("\n--- Menu Petshop ---");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Abastecer com água");
            System.out.println("3. Abastecer com shampoo");
            System.out.println("4. Verificar nível de água");
            System.out.println("5. Verificar nível de shampoo");
            System.out.println("6. Verificar se há pet na máquina");
            System.out.println("7. Colocar pet na máquina");
            System.out.println("8. Retirar pet da máquina");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> maquina.darBanho();
                case 2 -> maquina.abastecerAgua();
                case 3 -> maquina.abastecerShampoo();
                case 4 -> maquina.verificarNivelAgua();
                case 5 -> maquina.verificarNivelShampoo();
                case 6 -> maquina.verificarPetNaMaquina();
                case 7 -> {
                    System.out.print("Nome do pet: ");
                    String nome = scanner.nextLine();
                    Pet pet = new Pet(nome);
                    maquina.colocarPet(pet);
                }
                case 8 -> maquina.retirarPet();
                case 9 -> maquina.limparMaquina();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
