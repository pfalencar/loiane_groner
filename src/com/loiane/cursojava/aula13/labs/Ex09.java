package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit: ");
		double tempFarenheit = scan.nextDouble();
		double tempCelsius = (5 * (tempFarenheit - 32) / 9);
		System.out.println("Temperatura em graus Celsius: " + tempCelsius);
	}

}
