package model;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " atacou com a espada!");
    }

}
