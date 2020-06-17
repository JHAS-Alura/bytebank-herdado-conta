package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import java.lang.*;

//br.com.bytebank.banco.test.TestesContas
public class TestesContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		//Full Qualified Name FQN (nome do pacote + classe)
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
			
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		//ContaCorrente joao = new ContaCorrente(-111, -2222);
		

	}

}
