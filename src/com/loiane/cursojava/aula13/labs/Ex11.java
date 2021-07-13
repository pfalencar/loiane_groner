package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 2 números inteiros: ");
		int numInteiro1 = scan.nextInt();
		int numInteiro2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double numReal = scan.nextDouble();
		
		
		double divisaoResultA = ((double)numInteiro2 / 2);
		double resultA = (numInteiro1 * 2) * divisaoResultA;
		System.out.println("(" + numInteiro1 + " * 2) * (" + numInteiro2 +  "/ 2) = " +  resultA);
		
		double resultB = (3 * numInteiro1) + numReal;
		System.out.println("(3 * " + numInteiro1 + ") + " + numReal + " = " + resultB);
		
		double resultC = Math.pow(numReal, 3);
		System.out.println(numReal + " ^ 3 = " + resultC);
	}

}
