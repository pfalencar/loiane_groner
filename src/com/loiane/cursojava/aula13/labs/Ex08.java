package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? E número de horas trabalhadas no mês?: ");
		double salarioHora = scan.nextDouble();
		double hrTrabalhadasMes = scan.nextDouble();
		System.out.println("Salário mensal: " + (salarioHora * hrTrabalhadasMes));
		
	}

}
