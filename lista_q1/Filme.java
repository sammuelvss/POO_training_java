package lista_q1;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;

    }

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLacamento() {
        return this.anoLancamento;
    }

    public void setAnoLacamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String toString() {
        return "Titulo: " + titulo + " | Gênero: " + genero + " | Ano de lançamento: " + anoLancamento;
    }

}
