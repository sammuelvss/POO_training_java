package poo_rpg;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, double vida, int mana) {
        super(nome, nivel, vida);
        setMana(mana);
    }

    public void lancarFeitico() {
        if (this.mana >= 10) {
            System.out.println(getNome() + " lançou uma Fireball!");
            this.mana -= 10;
        } else {
            System.out.println("Mana insulficiente.");
        }
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
            System.out.println("Você está sem mana!");
        } else {
            this.mana = mana;
        }
    }
}
