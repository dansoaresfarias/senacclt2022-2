package AulaJAVA;

import java.util.Date;

import AulaJAVA.Entidades.Agencia;
import AulaJAVA.Entidades.Cliente;
import AulaJAVA.Entidades.Conta;

// Classe que vai dar início ao projeto Sistema Bancário
public class Principal {
    // Método main semelhante ao C
    public static void main(String[] args) {
        // System.out.println("Olá mundo!");
        Agencia agFacSenac = new Agencia(0023, "8132314545", "faculdade@bancosenac.com.br");
        Cliente clienteLuis = new Cliente("Luis Ernani", "111.222.333-00", "luis@gmail.com", "978787887", new Date(1986, 11, 18));
        Conta contaLuis = new Conta(123, clienteLuis, agFacSenac, 128.90, 1000);
        System.out.println(contaLuis.getSaldo());
    }
}