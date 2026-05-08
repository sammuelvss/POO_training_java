package prova2;

public class ContaPoupanca extends ContaBancaria implements Tributavel {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularImposto() {
        return 10.00;
    }

    @Override
    public void mostrarTipoDeConta() {
        System.out.println("Está é uma Conta Poupança!");
    }

    @Override
    public void sacar(double valor) throws Exception {
        if (valor > this.saldo) {
            throw new Exception("Saldo insuficiente! Você tem " + this.saldo + " e tentou sacar " + valor);
        }
        this.saldo -= valor;
    }
}
