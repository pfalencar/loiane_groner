package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as notas 1, 2, 3 e 4: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		System.out.println("Média = " + ((nota1 + nota2 + nota3 + nota4)/4));
	}

}
