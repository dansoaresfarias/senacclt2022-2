package AulaJAVA.Entidades;

public class Conta {
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private double limite;
    private boolean status;

    public Conta() {
    }

    public Conta(int numero, Cliente cliente, Agencia agencia, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.status = true;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
