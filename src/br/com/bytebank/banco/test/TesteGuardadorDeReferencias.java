package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
	
	public static void main(String[] args) {
		
		GuardadorDeReferencias go = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		go.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		go.adiciona(cc2);
		
		Cliente c1 = new Cliente();
		go.adiciona(c1);
		
		int tamanhoGuardadorObject = go.getQuantidade();
		System.out.println(tamanhoGuardadorObject);
		
		Conta ref2 = (Conta) go.getReferencia(0);
		System.out.println(ref2.getNumero());
		
		
	}

}
