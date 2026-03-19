package poo_rpg;
public class Personagem {

    private String nome;
    private int nivel;
    private double vida;
    public static int contadorPersonagens = 0;

    public Personagem(String nome, int nivel, double vida) {
        this.nome = nome;
        setNivel(nivel);
        setVida(vida);
        contadorPersonagens++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        if (vida < 0) {
            this.vida = 0;
            System.out.println("Você ta morto!");
        } else {
            this.vida = vida;
        }
    }
}
