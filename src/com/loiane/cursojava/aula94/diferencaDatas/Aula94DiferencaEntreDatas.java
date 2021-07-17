package com.loiane.cursojava.aula94.diferencaDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

	public static void main(String[] args) {

		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("------------------------");
		
		diferencaDataJava8();
		
		System.out.println("------------------------");
		
		diferencaDataJava8ComTempo();
		
		System.out.println("------------------------");
		
		diferencaDataJava8ComChronoUnit();
	}

	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2019");
		Date segundaDt = sdf.parse("01/02/2019");
		
		long diferEmMiliseg = Math.abs(segundaDt.getTime() - primeiraDt.getTime());
		System.out.println(diferEmMiliseg);
		long diff = TimeUnit.DAYS.convert(diferEmMiliseg, TimeUnit.MILLISECONDS);//converte miliseg para dias

		//1000ms=1s; 60s=1min; 60min=1h; 24h = 1 dia
		// 2678400000ms * (1s/1000ms) * (1min/60s) * (1h/60min) * (1dia/24h) = valor em horas
		int dias = (int) (diferEmMiliseg / (1000 * 60 * 60 * 24));
		
		System.out.println(diff);
		System.out.println(dias);
	}
	
	public static void diferencaDataJava8() {
		LocalDate data1 = LocalDate.of(2019, 1, 1); //01 jan 2019
		LocalDate data2 = LocalDate.of(2021, 2, 10); //10 fev 2019
		
		Period periodo = Period.between(data1, data2);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
	}
	
	public static void diferencaDataJava8ComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		Duration duracao = Duration.between(data1, data2);
		
		long difHoras = duracao.toHours();
		System.out.println("Diferença de horas: " + difHoras);
	}
	
	public static void diferencaDataJava8ComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		long diffHorasChrono = ChronoUnit.HOURS.between(data1, data2);
		long diffDias = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println("Diferença de horas Chrono: " + diffHorasChrono);
		System.out.println("Diferença de dias Chrono: " + diffDias);
	}
}
