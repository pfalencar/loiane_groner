package com.loiane.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {		
			
			try {				
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} 
			catch (ArithmeticException ex) {
				System.out.println(numeros[i] + "/"+ denominador[i] + " = Erro ao dividir");
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do array inv�lida");
				System.exit(0);
			}	
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou o catch");
				System.out.println();
			}
		}

	}

}
