package src_3.model;



public interface Transferivel {

    public void realizarTransferencia(ContaBancaria destino, double valor);

    public double calcularTaxaTransferencia();

}
