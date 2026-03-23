package lista_q2;

public class Banco {

    private Cliente[] clientes = new Cliente[2];

    public Banco(Cliente clientes[]) {
        this.clientes = clientes;
    }

    public Cliente[] getClientes() {
        return this.clientes;
    }

    public Cliente[] cadastraClientes() {
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);
        clientes[0] = c1;
        clientes[1] = c2;
        return this.clientes;
    }

    public String operacoes() {
        for (Cliente c : clientes) {
            c.saque(100);
        }
        for (Cliente c : clientes) {
            c.deposito(50);
        }

        for (Cliente c : clientes) {
            if (c.getSaldo() < 0) {
                c.setSaldo(50);
            }
        }

        clientes[1].setNome("Ada Lovelace");
        clientes[0].setCpf("12345689");
        String resultado = "";
        for (Cliente c : clientes) {
            resultado += c.toString() + "\n";
        }
        return resultado;

    }
}
