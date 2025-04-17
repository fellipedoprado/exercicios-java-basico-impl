package exercicios.java.basico.lista1;

import java.util.Scanner;

public class IMC {
    public static void executar(Scanner scanner) {
        System.out.println("Digite sua altura:");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso:");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}