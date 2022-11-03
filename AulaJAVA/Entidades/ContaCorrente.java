package AulaJAVA.Entidades;

public class ContaCorrente extends Conta {

    private double taxaManutencao;

    public ContaCorrente(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public ContaCorrente(int numero, Cliente cliente, Agencia agencia, double saldo, double limite,
            double taxaManutencao) {
        super(numero, cliente, agencia, saldo, limite);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        // TODO Auto-generated method stub
        if ((this.getSaldo() + this.getLimite()) >= (valor + valor * this.taxaManutencao)) {
            double saldoAtual = this.getSaldo();
            saldoAtual -= this.taxaManutencao * valor;
            this.setSaldo(saldoAtual);
            return super.sacar(valor);
        } else {
            return false;
        }
    }

}
