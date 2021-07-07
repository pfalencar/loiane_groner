package com.loiane.cursojava.aula34.labs.exer01;

public class Teste {
	
	private static void imprimirValor() {
		System.out.println(Contador.retornarContador());
	}

	public static void main(String[] args) {

		Contador cont = new Contador();
		imprimirValor();
		
		Contador cont2 = new Contador();
		imprimirValor();
		
		Contador.zerarContadorInstancias();
		imprimirValor();
		
		Contador cont3 = new Contador();
		imprimirValor();
		
		Contador.incrementarContador();
		imprimirValor();
	}

}
