package com.loiane.cursojava.aula50;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal: ");
		
		try {
			
			double num = lerNumero();
			System.out.println("Você digitou: " + num);	
			
		} catch (Exception e1) {
			System.out.println("Entrada inválida.");
			e1.printStackTrace();
		}	
	
	}

	private static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		Double entradaNum = scan.nextDouble();
		return entradaNum;
	}
}
