package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora? E n�mero de horas trabalhadas no m�s?: ");
		double salarioHora = scan.nextDouble();
		double hrTrabalhadasMes = scan.nextDouble();
		System.out.println("Sal�rio mensal: " + (salarioHora * hrTrabalhadasMes));
		
	}

}
