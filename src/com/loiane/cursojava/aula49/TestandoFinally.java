package com.loiane.cursojava.aula49;

public class TestandoFinally {

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
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida");
			}	
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou o catch");
			}
		}

	}

}
