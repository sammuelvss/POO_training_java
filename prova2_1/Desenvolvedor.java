package prova2_1;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);

    }

    @Override
    public double calcularSalarioFinal() {       
        return this.getSalarioBase();
    }
}
