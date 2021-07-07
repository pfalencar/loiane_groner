package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o lado do quadrado: ");
		double lado = scan.nextDouble();
		System.out.println("Área do quadrado * 2 = " + (Math.pow(lado, 2))*2);
	}

}
