package prova2;

public class ContaCorrente extends ContaBancaria implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularImposto() {
        return 15.00;
    }

    @Override
    public void mostrarTipoDeConta() {
        System.out.println("Está é uma Conta Poupança!");
    }

    @Override
    public void sacar(double valor) {
        saldo -= (valor + 2);
    }
}
