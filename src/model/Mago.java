package model;

public class Mago extends Personagem implements Curavel {

    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " Lançou uma bola de fogo!");
    }

    public void recuperarVida() {
        if (getVida() < 100) {
            setVida(this.getVida() + 20);
        }
        System.out.println("Sua vida atual é: " + this.getVida());

    }
}
