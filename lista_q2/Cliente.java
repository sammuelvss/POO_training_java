package lista_q2;

public class Cliente {

    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    public Cliente(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public Cliente(String nome, String cpf, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int extrato() {
        return this.saldo;
    }

    public void saque(int val) {
        setSaldo(this.saldo - val);
        System.out.println("Seu saldo atual após o saque: " + this.saldo);
    }

    public void deposito(int val) {
        setSaldo(this.saldo + val);
        System.out.println("Seu saldo atual após o deposito: " + this.saldo);
    }

    public String toString() {
        return "Cliente: " + getNome() + "\nCPF: " + getCpf() + "\nConta: " + getNumConta() + "\nSaldo: " + getSaldo();
    }

}
