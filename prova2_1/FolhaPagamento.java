package prova2_1;

public class FolhaPagamento {

    public void registrarPagamento(Funcionario f) {
        double total = f.calcularSalarioFinal();

        if (total > 0) {
            System.out.println("Pagamento processado: R$ " + total);
        } else {
            System.out.println("Erro: Salário inválido");
        }
    }

    public void realizarLogin(Autenticavel a, String senha) {

        if (a.login(senha) == false) {
            System.out.println("Acesso Negado.");
        } else {
            System.out.println("Acesso Liberado!");
        }
    }

}
