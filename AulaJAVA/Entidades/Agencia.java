package AulaJAVA.Entidades;

import java.util.ArrayList;

public class Agencia {
    private int numero;
    private String telefone;
    private String email;
    private Endereco endereco;
    private ArrayList<Cliente> carteiraClientes;

    public Agencia() {
        this.carteiraClientes = new ArrayList<Cliente>();
    }

    public Agencia(int numero, String telefone, String email, Endereco end) {
        this.numero = numero;
        this.telefone = telefone;
        this.email = email;
        this.endereco = end;
        this.carteiraClientes = new ArrayList<Cliente>();
    }

    public boolean inserirCliente(Cliente clienteNovo){
        return this.carteiraClientes.add(clienteNovo);
    }

    public Cliente buscarCliente(String cpf){
        for (Cliente cliente : carteiraClientes) {
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    public boolean removerCliente(String cpf){
        for (Cliente cliente : carteiraClientes) {
            if(cliente.getCpf().equals(cpf)){
                return this.carteiraClientes.remove(cliente);
            }
        }
        return false;
    }

    public boolean atualizarCliente(Cliente cliente){
        for (Cliente cli: carteiraClientes) {
            if(cli.getCpf().equals(cliente.getCpf())){
                this.carteiraClientes.set(this.carteiraClientes.indexOf(cli), cliente);
                return true;
            }
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
