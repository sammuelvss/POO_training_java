package service;

import model.Personagem;
import model.Curavel;

public class GerenciadorArena {

    public void iniciarTurno(Personagem p) throws VidaInsuficienteException {
        if (p.getVida() <= 0) {
            throw new VidaInsuficienteException("O personagem " + p.getNome() + " está fora de combate!");
        }
        p.atacar();
    }

    public void aplicarCura(Curavel c) {
        c.recuperarVida();
    }

}
