package model;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        if(salarioBase <= 0){
            throw new IllegalArgumentException("Salario base Inválido.");
        }

        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser vazio!.");
        }

        this.nome = nome;
        this.salarioBase = salarioBase;
    }


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

    public abstract double calcularSalarioFinal();

}
