package prova2;

public abstract class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws Exception {
        if (valor > this.saldo) {
            throw new Exception("Saldo insulficiente para o saque de: " + valor);
        }
        this.saldo -= valor;
    }

    public abstract void mostrarTipoDeConta();

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}