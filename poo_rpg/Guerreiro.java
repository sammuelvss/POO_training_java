package poo_rpg;

public class Guerreiro extends Personagem {
    private int armadura;

    public Guerreiro(String nome, int nivel, double vida, int armadura) {
        super(nome, nivel, vida);
        this.armadura = armadura;
    }

    public void usarEscudo() {
        System.out.println("O guerreiro " + this.getNome() + " bloqueou o ataque!");
    }

    public int getArmadura() {
        return this.armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
}
