package prova2_1;

public class Gerente extends Funcionario implements Autenticavel {
    private double bonusGerencia;

    public Gerente(double bonusGerencia, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.getSalarioBase() + this.bonusGerencia;
    }

    public double getBonusGerencia() {
        return this.bonusGerencia;
    }

    public void setBonusGerencia(double bonusGerencia) {
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public boolean login(String senha) {
        if (senha.equals("admin123")) {
            return true;
        }
        return false;
    }

}
