package com.loiane.cursojava.aula89.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		//serve para qdo queremos especificar o formato da data
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		
		Calendar data = new GregorianCalendar(2010, 4, 20, 14, 32, 25);
		
		String d = sdf.format(data.getTime()); //conversão data para string		
		System.out.println(d);
		
		Date dataHoje = new Date();		
		System.out.println(sdf.format(dataHoje));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "26/11/2021";		
		Date minhaDataEmDate = null;
		try {
			minhaDataEmDate = sdf1.parse(minhaData); //conversão String para Date
			System.out.println("minhaDataEmDate: " + minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
			
		} catch (ParseException e) {
			System.out.println("Aconteceu um erro");
			e.printStackTrace();
		}
		System.out.println(minhaDataEmDate);
		
	}

}
