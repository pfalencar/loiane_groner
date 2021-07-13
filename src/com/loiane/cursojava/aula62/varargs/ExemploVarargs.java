package com.loiane.cursojava.aula62.varargs;

public class ExemploVarargs {

	public static void main(String[] args) {
//		System.out.println(soma(1,2));
//		System.out.println(soma(1,2,3));
		
//		int[] vetor = {1, 2, 3, 4, 5};
//		System.out.println(soma(vetor));
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(soma2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	//Varargs usa-se quando não se sabe quantos parâmetros serão passados.
	private static int soma(Integer...vetor) {
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
//		for (int i : vetor) {
//			soma += i;
//		}		
		return soma;
	}

	//o Varargs deve ser passado sempre por último na assinatura do método
	private static int soma2 (int a, int b, Integer...vetor) {
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
//		for (int i : vetor) {
//			soma += i;
//		}		
		return soma;
	}
	
	private static int soma(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	private static int soma(int a, int b) {
		return a + b;
	}
	
	private static int soma (int a, int b, int c) {
		return a + b + c;
	}
	
	

}
