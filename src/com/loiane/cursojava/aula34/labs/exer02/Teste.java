package com.loiane.cursojava.aula34.labs.exer02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		double res = Calculadora.somar(3.5,  4.0);
		imprimirTela(res);
		
		double res2 = Calculadora.subtrair(3.5,  4.0);
		imprimirTela(res2);

		double res3 = Calculadora.multiplicar(2, 5);
		imprimirTela(res3);

		double res4 = Calculadora.dividir(10, 0);
		imprimirTela(res4);		

		double res5 = Calculadora.elevarAPotencia(2, 10);
		imprimirTela(res5);

		double res6 = Calculadora.calcularFatorial(0);
		imprimirTela(res6);
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Entre com um número positivo");
			num = scan.nextInt();
			
			if(num < 0) {
				System.out.println("Número inválido, entre novamente");
			}
		} while (num < 0);
		
		Calculadora.calcularFatorial(num);
		imprimirTela(num);
	}
	
	private static void imprimirTela(double num) {
		System.out.println(num);
	}

}
