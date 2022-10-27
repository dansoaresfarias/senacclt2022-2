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

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaFav) {
        if(contaFav != null){
            if (this.saldo + this.limite >= valor) {
                this.saldo -=  valor;
                contaFav.saldo += valor;
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
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

    public String toString(){
        return "Conta de número: " + this.numero + " | " + this.cliente.toString();
    }
}
