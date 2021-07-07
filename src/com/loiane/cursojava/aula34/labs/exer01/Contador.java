package com.loiane.cursojava.aula34.labs.exer01;

public class Contador {

	private static int contadorInstancias;
	
	public Contador() {
		contadorInstancias++;
	}
	
	public static void zerarContadorInstancias () {
		contadorInstancias = 0;
	}
	
	public static void incrementarContador () {
		contadorInstancias++;
	}
	
	public static int retornarContador() {
		return contadorInstancias;
	}
}
