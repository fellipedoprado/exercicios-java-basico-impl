package exercicios.java.basico.lista3.carro;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro precisa estar parado e em ponto morto para desligar.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (marcha == 0) {
            System.out.println("O carro está em ponto morto e não pode acelerar.");
            return;
        }
        if (velocidade < 120) {
            velocidade++;
            if (!validarVelocidadeComMarcha()) {
                velocidade--;
                System.out.println("Velocidade excede o limite da marcha atual.");
            } else {
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            }
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a " + direcao);
        } else {
            System.out.println("Velocidade inadequada para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    private boolean validarVelocidadeComMarcha() {
        return switch (marcha) {
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }
}
