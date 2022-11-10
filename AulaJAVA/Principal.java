package AulaJAVA;

import java.util.Date;

import AulaJAVA.Entidades.Agencia;
import AulaJAVA.Entidades.Cliente;
import AulaJAVA.Entidades.ContaCorrente;
import AulaJAVA.Entidades.ContaPoupanca;
import AulaJAVA.Entidades.Endereco;

// Classe que vai dar início ao projeto Sistema Bancário
public class Principal {
    // Método main semelhante ao C
    public static void main(String[] args) {
        // System.out.println("Olá mundo!");
        Endereco endAgSenac = new Endereco("PE", "Recife", "Santo Amaro", "Pombal", 55, "Sala 1201", "50050-050");
        Endereco endCliente = new Endereco("PE", "Recife", "Aflitos", "Manoel de Carvalho", 145, "1406", "51070-083");
        Agencia agFacSenac = new Agencia(0023, "8132314545", "faculdade@bancosenac.com.br", endAgSenac);
        Cliente clienteLuis = new Cliente("Luis Ernani", "111.222.333-00", "luis@gmail.com", "978787887", new Date(1986, 11, 18), endCliente);
        ContaPoupanca contaLuis = new ContaPoupanca(123, clienteLuis, agFacSenac, 128.90, 0, 0.02);
        Cliente clienteDeborah = new Cliente("Deborah Novaes", "111.222.444-00", "deborah@gmail.com", "978787899", new Date(1993, 11, 13), endCliente);
        ContaCorrente contaDeborah = new ContaCorrente(123, clienteDeborah, agFacSenac, 18120.00, 5000, 0.01);
        Cliente clienteDanilo = new Cliente("Danilo Novaes", "111.222.555-88", "danilo@gmail.com", "978787893", new Date(1990, 9, 7), endCliente);
        ContaCorrente contaDanilo = new ContaCorrente(321, clienteDanilo, agFacSenac, 200, 800, 0.01);
        //System.out.println(contaLuis);
        //System.out.println(contaLuis.getSaldo());
        agFacSenac.inserirCliente(clienteLuis);
        agFacSenac.inserirCliente(clienteDeborah);
        agFacSenac.inserirCliente(clienteDanilo);
        System.out.println(agFacSenac.buscarCliente("111.222.444-00"));
        clienteDanilo.setEmail("dansoaresfrias@gmail.com");
        agFacSenac.atualizarCliente(clienteDanilo);
        //agFacSenac.removerCliente("111.222.555-88");
        contaLuis.depositar(7500);
        contaLuis.sacar(1800);
        contaLuis.sacar(459);
        contaLuis.depositar(1200);
        contaLuis.sacar(4000);
        contaLuis.sacar(130);
        contaLuis.transferir(150, contaDeborah);
        contaDeborah.sacar(2000);
        contaDanilo.depositar(2000);
        contaDanilo.sacar(500);
        System.out.println(contaLuis.extrato());
        System.out.println(contaDeborah.extrato());
    }
}