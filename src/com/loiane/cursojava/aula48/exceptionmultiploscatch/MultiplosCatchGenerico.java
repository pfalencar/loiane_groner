package com.loiane.cursojava.aula48.exceptionmultiploscatch;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
		

			int[] numeros = {4, 8, 16, 32, 64, 128};
			int[] denominador = {2, 0, 4, 8, 0};
			
			for(int i = 0; i < numeros.length; i++) {		
				
				try {						
					double resp = numeros[i] / denominador[i];
					System.out.println(numeros[i] + "/" + denominador[i] + " = " + resp);
				
				} 
				catch (ArithmeticException ex) {
					System.out.println(numeros[i] + "/"+ denominador[i] + " = Erro ao dividir");
				
				}
				catch (Throwable exc) { //Throwable é a super classe de todos os erros e exceptions do java.
					System.out.println("Ocorreu um erro");
				}
				 
			}		
	}
}
