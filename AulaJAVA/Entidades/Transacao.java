package AulaJAVA.Entidades;

import java.util.Date;

enum TipoTransacao {
    DÉBITO, DEPÓSITO, TRANSFERÊNCIA;
}

public class Transacao {
    private TipoTransacao tipo;
    private Date data;
    private double valor;
    private Cliente clienteTrans;
    private char tipoValor;

    public Transacao() {
    }

    public Transacao(TipoTransacao tipo, Date data, double valor, Cliente clienteTrans, char tipoValor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.clienteTrans = clienteTrans;
        this.tipoValor = tipoValor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getClienteTrans() {
        return clienteTrans;
    }

    public void setClienteTrans(Cliente clienteTrans) {
        this.clienteTrans = clienteTrans;
    }

    public char getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(char tipoValor) {
        this.tipoValor = tipoValor;
    }

}
