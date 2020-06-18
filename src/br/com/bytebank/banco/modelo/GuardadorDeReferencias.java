package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] ref;
	private int posLivre;
	
	public GuardadorDeReferencias() {
		this.ref = new Object[5];
		this.posLivre = 0;
	}

	public void adiciona(Object obj ) {
		this.ref[this.posLivre] = obj;
		this.posLivre++;
	}

	public int getQuantidade() {
		return this.posLivre;
	}

	public Object getReferencia(int pos) {
		return this.ref[pos];
	}
	
	

}
