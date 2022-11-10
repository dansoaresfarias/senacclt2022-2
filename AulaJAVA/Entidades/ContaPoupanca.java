package AulaJAVA.Entidades;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, Cliente cliente, Agencia agencia, double saldo, double limite,
            double taxaRendimento) {
        super(numero, cliente, agencia, saldo, limite);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public boolean depositar(double valor) {
        // TODO Auto-generated method stub
        double saldo = super.getSaldo();
        saldo += this.taxaRendimento*saldo;
        super.setSaldo(saldo);
        return super.depositar(valor);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }   
    
}
