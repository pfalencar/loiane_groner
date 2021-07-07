package com.loiane.cursojava.aula34.labs.exer02;

public class Calculadora {
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	public static double elevarAPotencia(double num, double potencia) {
		return Math.pow(num, potencia);
	}
	
	public static int calcularFatorial(int num) {
		if (num == 0) {
			return 1;
		}
		
		int fat = 1;
		for(int i = num; i > 1; i--) {
			fat = fat * i;
		}
		return fat;
	}
	

}
