package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Celsius: ");
		// F = (9C + 160)/5
		double tempCelsius = scan.nextDouble();
		double tempFarenheit = ((9*tempCelsius) + 160) / 5;
		System.out.println("Temperatura em Farenheit: " + tempFarenheit);
	}

}
