package com.loiane.cursojava.aula99.random;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 10));

		Random aleatorio = new Random();
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(101));
		
		System.out.println(aleatorio.nextInt(5 + 1));


	}

}
