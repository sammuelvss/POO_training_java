package prova2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaPoupanca(1000);
        ContaBancaria c2 = new ContaCorrente(1000);

        try {
            System.out.println("Tentando sacar valor da Poupança...");
            c1.sacar(20000);
            System.out.println("Saque realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro no sistema: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada (com ou sem erro).");
        }

        Tributavel t1 = (Tributavel) c1;
        Tributavel t2 = (Tributavel) c2;
        ArrayList<Tributavel> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tributavel t : lista) {
            System.out.println(t.calcularImposto());
        }

        /*
         * c.mostrarTipoDeConta();
         * c.sacar(100);
         * 
         * System.out.println("Saldo atual após o saque: " + c.getSaldo());
         * 
         * Tributavel t = (Tributavel) c;
         * System.out.println("Imposto a pagar: " + t.calcularImposto());
         */

    }
}
