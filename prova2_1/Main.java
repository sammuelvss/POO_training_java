package prova2_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario g = new Gerente(10, "Sandro", 1200);

        Funcionario d = new Desenvolvedor("Pedro", 1000);

        FolhaPagamento folha = new FolhaPagamento();

        ArrayList<Funcionario> equipe = new ArrayList<>();

        equipe.add(g);
        equipe.add(d);

        for (Funcionario f : equipe) {
            folha.registrarPagamento(f);
        }

    }
}
