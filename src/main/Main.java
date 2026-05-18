package main;

import model.*;
import service.GerenciadorArena;
import service.VidaInsuficienteException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guerreiro g = new Guerreiro("Pedro", 100);
        Mago m = new Mago("Lucas", 0);

        ArrayList<Personagem> pLista = new ArrayList<>();
        pLista.add(g);
        pLista.add(m);

        GerenciadorArena gArena = new GerenciadorArena();

        for (Personagem p : pLista) {
            try {
                gArena.iniciarTurno(p);
            } catch (VidaInsuficienteException e) {
                System.out.println(e.getMessage());

            }
        }

        gArena.aplicarCura(m);

    }

}