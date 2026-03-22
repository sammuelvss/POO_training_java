package lista_q1;

public class LocadoraEstoque {
    public static void main(String[] args) {

        Locadora mLocadora = new Locadora(null, null, 0, null, null);

        Filme f1 = new Filme("Harry Potter 1", "fantasia", 2010);
        Filme f2 = new Filme("Harry Potter 2", "ação", 2015);
        Filme f3 = new Filme("Harry Potter 2", "comedia", 2019);

        mLocadora.adicionarFilme(f1);
        mLocadora.adicionarFilme(f2);
        mLocadora.adicionarFilme(f3);

        mLocadora.listarFilmes();
    }
}
