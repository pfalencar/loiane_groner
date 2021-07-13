package com.loiane.cursojava.aula88.gregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		imprimirData(hoje);
		
		System.out.println(hoje.isLeapYear(2021)); //verifica se é ano bixesto, só no GregorianCalendar
		
		GregorianCalendar hoje2 = new GregorianCalendar(2021, 6, 13, 19, 18, 3);
		
		imprimirData(hoje2);
		imprimirData(hoje1);
	}
	
	private static void imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH); //janeiro = 0, fevereiro = 1, ..., dezembro = 11
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int hora2 = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d %s %02d:%02d:%02d", dia, (mes+1), ano, "às", hora, minutos, segundos);
		System.out.println();
	}

}
