package exercicios.java.basico.lista3.petshop;

public class MaquinaBanho {
    private Pet petNaMaquina;
    private int nivelAgua;
    private int nivelShampoo;

    public MaquinaBanho() {
        this.petNaMaquina = null;
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
    }

    public void colocarPet(Pet pet) {
        if (petNaMaquina != null) {
            System.out.println("Já há um pet na máquina.");
        } else {
            petNaMaquina = pet;
            System.out.println("Pet " + pet.getNome() + " colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina.");
        } else {
            if (!petNaMaquina.estaLimpo()) {
                System.out.println("Pet retirado sujo. Máquina precisa ser limpa.");
            } else {
                System.out.println("Pet retirado limpo.");
            }
            petNaMaquina = null;
        }
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 > 30) {
            System.out.println("Não é possível abastecer mais água.");
        } else {
            nivelAgua += 2;
            System.out.println("Abastecido com 2L de água. Nível atual: " + nivelAgua + "L");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 > 10) {
            System.out.println("Não é possível abastecer mais shampoo.");
        } else {
            nivelShampoo += 2;
            System.out.println("Abastecido com 2L de shampoo. Nível atual: " + nivelShampoo + "L");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + "L");
    }

    public void verificarPetNaMaquina() {
        if (petNaMaquina != null) {
            System.out.println("Há um pet na máquina: " + petNaMaquina.getNome());
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (petNaMaquina != null) {
            System.out.println("Não é possível limpar com o pet na máquina.");
        } else if (nivelAgua >= 3 && nivelShampoo >= 1) {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            System.out.println("Máquina limpa com sucesso.");
        } else {
            System.out.println("Níveis insuficientes de água ou shampoo para limpeza.");
        }
    }

    public void darBanho() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina para dar banho.");
        } else if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Níveis insuficientes de água ou shampoo para o banho.");
        } else {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            petNaMaquina.setLimpo(true);
            System.out.println("Banho dado com sucesso no pet " + petNaMaquina.getNome() + "!");
        }
    }
}
