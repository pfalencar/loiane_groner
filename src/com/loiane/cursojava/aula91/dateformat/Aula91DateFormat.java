package com.loiane.cursojava.aula91.dateformat;

import java.text.DateFormat; //mais útil ao trabalhar com Locale
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println(data);
		
		System.out.println(Locale.getDefault());
		
		//de Data para String 
		String dataFormatada = DateFormat.getInstance().format(data); // o método format retorna uma String
		System.out.println(dataFormatada);
		
		Locale.setDefault(new Locale("en", "US"));
		String dataFormatada2 = DateFormat.getInstance().format(data);
		System.out.println(dataFormatada2);
		
		String dataFormatada3 = DateFormat.getTimeInstance().format(data);
		System.out.println(dataFormatada3);
		
		String dataFormatada4 = DateFormat.getDateInstance().format(data);
		System.out.println(dataFormatada4); // MMM/dd/yyyy padrão americano, pq setei en, US.
		
		String dataFormatada5 = DateFormat.getDateTimeInstance().format(data);
		System.out.println(dataFormatada5); // MMM/dd/yyyy HH:mm:ss

		String dataFormatada6 = DateFormat.getTimeInstance(DateFormat.SHORT).format(data);
		System.out.println(dataFormatada6); 

		String dataFormatada7 = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(data);
		System.out.println(dataFormatada7); 

		String dataFormatada8 = DateFormat.getTimeInstance(DateFormat.LONG).format(data);
		System.out.println(dataFormatada8); 
		
		String dataFormatada9 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(data);
		System.out.println(dataFormatada9);
		
		//de String para Date
		Locale.setDefault(new Locale("pt", "BR"));
		String dataString = "12/02/2017 14:25";
		try {
			Date dataStringEmDate = DateFormat.getInstance().parse(dataString); // String para Date
			System.out.println("dataStringEmDate: " + dataStringEmDate);
			
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataStringEmDate); //converte Date para Calendar
			System.out.println(calendario);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
