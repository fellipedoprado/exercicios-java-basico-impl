package exercicios.java.basico.lista3.petshop;

public class Pet {
    private final String nome;
    private boolean limpo;

    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean estaLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
