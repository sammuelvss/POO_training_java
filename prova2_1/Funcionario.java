package prova2_1;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario (String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
    

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
}
