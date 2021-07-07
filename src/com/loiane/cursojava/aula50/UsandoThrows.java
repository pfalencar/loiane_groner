package com.loiane.cursojava.aula50;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um n�mero decimal: ");
		
		try {
			
			double num = lerNumero();
			System.out.println("Voc� digitou: " + num);	
			
		} catch (Exception e1) {
			System.out.println("Entrada inv�lida.");
			e1.printStackTrace();
		}	
	
	}

	private static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		Double entradaNum = scan.nextDouble();
		return entradaNum;
	}
}
