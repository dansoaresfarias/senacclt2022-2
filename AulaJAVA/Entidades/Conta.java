package AulaJAVA.Entidades;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta {
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private double limite;
    private boolean status;
    private ArrayList<Transacao> transacoes;

    public Conta() {
        this.status = true;
        this.transacoes = new ArrayList<Transacao>();
    }

    public Conta(int numero, Cliente cliente, Agencia agencia, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.status = true;
        this.transacoes = new ArrayList<Transacao>();
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            Transacao trans = new Transacao(TipoTransacao.DÉBITO, new Date(), valor, this.getCliente(), '-');
            this.transacoes.add(trans);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            Transacao trans = new Transacao(TipoTransacao.DEPÓSITO, new Date(), valor, this.getCliente(), '+');
            this.transacoes.add(trans);
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaFav) {
        if (contaFav != null) {
            if (this.saldo + this.limite >= valor) {
                // Retirando dinheiro da própria conta
                this.saldo -= valor;
                // Criando a transação de transferência retirando dinheiro da própria conta
                Transacao transEmitente = new Transacao(TipoTransacao.TRANSFERÊNCIA, new Date(), valor,
                        contaFav.getCliente(), '-');
                // Adcionando a transação nas transações da própria conta
                this.transacoes.add(transEmitente);
                // Colocando dinheiro na conta favorecida
                contaFav.saldo += valor;
                // Criando a transação de transferência para a conta favorecida
                Transacao transFav = new Transacao(TipoTransacao.TRANSFERÊNCIA, new Date(), valor, this.getCliente(),
                        '+');
                // Adcionando a transação nas transações da conta favorecida
                contaFav.transacoes.add(transFav);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String extrato() {
        String extrato = "";
        extrato += this.toString() + "\n";
        for (Transacao trans : this.transacoes) {
            extrato += trans.toString() + "\n" ;
        }
        extrato += "Saldo: R$ " + Math.round(this.saldo) + " | " + "Saldo Disponível R$ " + Math.round(this.saldo + this.limite);
        return extrato;
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

    @Override
    public String toString() {
        return "Conta de número: " + this.numero + " | " + this.cliente.toString();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
