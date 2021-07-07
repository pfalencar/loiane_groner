package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do círculo: ");
		double raioCirculo = scan.nextDouble();
		double areaCirculo = Math.PI * (Math.pow(raioCirculo, 2));
		System.out.println("Área do círculo = " + areaCirculo);
	}

}
