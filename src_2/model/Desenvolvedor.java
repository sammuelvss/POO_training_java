package model;

public class Desenvolvedor extends Funcionario implements Bonificavel {
    
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus(){
        return getSalarioBase() * 0.10;
    }

    @Override
    public void descreverRegraBonus(){
        System.out.println("O dev tem 10% de bonus.");
    }

    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() + calcularBonus();
    }
    
}
