package com.loiane.cursojava.aula51;

public class ErroEstourarMemoria {
	
	private static long num;

	public static void main(String[] args) {
		//OutOfMemoryError é um erro não verificado. 
		//Erros NÃO tem tratamento com try catch.
		for (int i = 0; i < 1000000000; i++) {

			ErroEstourarMemoria[] eem = new ErroEstourarMemoria[500000000];
			eem[i].num = i;
			System.out.println("eem[" + i + "].num = " + i);
		}
	}

}
