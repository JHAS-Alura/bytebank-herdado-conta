package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		
		String nome = "Alura"; //object literal 
		//String outro = new String("Alura");
		String nome2 = "ALURA";
		String nome3 = "joao";
		
		String vazio = "    	Alura    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		//System.out.println(outroVazio.isEmpty());
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

//		String sub = nome.substring(1);
//		System.out.println(sub);
//		
//		char c = nome.charAt(0);
//		System.out.println(c);
//		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
//		
//		String outra = nome.replace("A", "a");
//		
//		String outra2 = nome2.toLowerCase();
//		
//		String outra3 = nome3.toUpperCase();
//		
//		System.out.println(nome);
//		System.out.println(outra);
//		
//		System.out.println(nome2);
//		System.out.println(outra2);
//		
//		System.out.println(nome3);
//		System.out.println(outra3);
		
	}

}
