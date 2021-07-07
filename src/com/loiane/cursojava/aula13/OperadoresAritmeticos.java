package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7; // 10/7=1  e resto=3. Mod retorna o resto.
		System.out.println(resultado);
		
		String primeiroNomme = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNomme + segundoNome;
		System.out.println(terceiroNome);
		
		resultado++;
		System.out.println(resultado); 
		
		resultado = resultado + 1;
		resultado += 1; //é a mesma coisa que o de cima.
		
		System.out.println(resultado++);
		System.out.println(++resultado);
		//8
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);


	}

}
