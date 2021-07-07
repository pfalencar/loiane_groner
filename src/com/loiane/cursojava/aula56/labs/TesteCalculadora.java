package com.loiane.cursojava.aula56.labs;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		double x = 2.0;
		double y = 3.0;
		
		for (Calculadora c: Calculadora.values()) {
			
			System.out.print(x + " ");
			System.out.print(c.toString() + " ");
			System.out.print(y + " = ");
			System.out.print(c.executarOperacao(x, y));
			System.out.println();
		}
		
	}

}
