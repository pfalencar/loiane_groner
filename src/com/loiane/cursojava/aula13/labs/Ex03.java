package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero 1 e o n�mero 2: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Soma = " + (num1+num2));
		
	}
}
