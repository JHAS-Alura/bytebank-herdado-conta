package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	//Array[]
	public static void main(String[] args) {

		/* Se eu quisesse gravar 5 idades, teria que fazer:
			int idade1 = 29;
			int idade2 = 39;
			int idade3 = 19;
			int idade4 = 69;
			int idade5 = 59;
		 */

		int[] idades = new int[5]; //Inicializa o array com os valores padrões do tipo

		/*  Com o Array fica:	
			idades[0] = 29;
			idades[1] = 39;
			idades[2] = 49;
			idades[3] = 59;
			idades[4] = 69;

			int idade4 = idades[4];

			System.out.println(idade4);
			System.out.println(idades.length);
		 */
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
		

	}

}
