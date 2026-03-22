package lista_q1;

import java.util.ArrayList;

public class Locadora extends Filme {
    private String nome;
    private ArrayList<Filme> filmes = new ArrayList<>();

    public Locadora(String titulo, String genero, int anoLancamento, String nome, Filme filmes) {
        super(titulo, genero, anoLancamento);
        this.nome = nome;
        filmes = null;
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme f : filmes) {
            System.out.println(f.toString());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
