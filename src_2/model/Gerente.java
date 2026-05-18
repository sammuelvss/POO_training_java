package model;

public class Gerente extends Funcionario implements Bonificavel {
    
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus(){
        return getSalarioBase() * 0.20;
    }

    @Override
    public void descreverRegraBonus(){
        System.out.println("O gerente ganha 20% de bonus.");
    }

    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() + calcularBonus();
    }

}
