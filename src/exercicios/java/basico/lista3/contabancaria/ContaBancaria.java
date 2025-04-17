package exercicios.java.basico.lista3.contabancaria;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.chequeUsado = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getChequeUsado() {
        return chequeUsado;
    }

    public void depositar(double valor) {
        // Se estiver usando cheque especial, cobrar 20% do valor usado
        if (chequeUsado > 0) {
            double taxa = chequeUsado * 0.2;
            saldo -= taxa;
            chequeUsado = 0;
        }
        saldo += valor;
    }

    public boolean sacar(double valor) {
        double totalDisponivel = saldo + (chequeEspecial - chequeUsado);
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else if (valor <= totalDisponivel) {
            double restante = valor - saldo;
            saldo = 0;
            chequeUsado += restante;
            return true;
        }
        return false;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public boolean usandoChequeEspecial() {
        return chequeUsado > 0;
    }
}
