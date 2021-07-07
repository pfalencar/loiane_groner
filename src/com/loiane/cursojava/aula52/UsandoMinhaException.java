package com.loiane.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {

		try {
			teste();
		} catch (DivisaoNaoExata e) {
			e.printStackTrace();
		}
			
	}

	public static void teste() throws DivisaoNaoExata {
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0, 2, 4};
		
		for(int i = 0; i < numeros.length; i++) {		
			
			try {	
				if (numeros[i] % 2 != 0) {
					throw new DivisaoNaoExata(numeros[i], denominador[i]);
				} 
				if (denominador[i] == 0) {
					throw new ArithmeticException("Nunca dividir�s por zero.");
				}
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i] / denominador[i]));
				
			} 
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Ocorreu um erro");
				e1.printStackTrace(); //printa: o toString da classe de excecao criada e a linha do erro.
			}
		}
	}
}
