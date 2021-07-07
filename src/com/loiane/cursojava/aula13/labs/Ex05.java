package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		System.out.println("Digite o valor em metros: ");
		double metros = scan.nextDouble();
		System.out.println(metros + " metro(s) = " + (metros * 100) + " centímetros");
	}

}
