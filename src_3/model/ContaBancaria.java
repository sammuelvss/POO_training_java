package src_3.model;

public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {

        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular está vazio!");
        }

        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo!.");
        }

        this.titular = titular;
        this.saldo = saldo;

    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
