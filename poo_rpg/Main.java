package poo_rpg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Personagem> party = new ArrayList<>();

        party.add(new Guerreiro("Arthur", 3, 100.0, 80));
        party.add(new Mago("Harry", 7, 80.0, 100));

        for (Personagem pers : party) {
            statusGeral(pers);
        }
    }

    public static void statusGeral(Personagem p) {
        System.out.println("nome:" + p.getNome());
        System.out.println("nivel:" + p.getNivel());
        System.out.println("vida:" + p.getVida());
        if (p instanceof Guerreiro) {
            Guerreiro g = (Guerreiro) p;
            System.out.println("Armadura:" + g.getArmadura());

        } else if (p instanceof Mago) {
            Mago m = (Mago) p;
            System.out.println("Mana: " + m.getMana());
        } else {
            System.out.println("\nPersonagem padrão!");
        }
    }
}