package com.loiane.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		int soma1 = calc.soma(1,2);
		System.out.println(soma1);
		
		System.out.println(calc.soma(2.1, 8.0));
		
	}

}
