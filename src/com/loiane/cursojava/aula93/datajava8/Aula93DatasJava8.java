package com.loiane.cursojava.aula93.datajava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

	//Baseado no Joda Time
	public static void main(String[] args) {

		//data formato ISO: dd MM yyyy
		LocalDate agora = LocalDate.now(); //data de hoje
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2021, 07, 15));
		try {
			System.out.println(LocalDate.parse("2019-12-01")); //converte uma String em LocalDate	
		} catch (DateTimeParseException e) { //se não passar a data neste formato ou inválida: erro em tempo de execução
			System.out.println("Entrada de data inválida");
			e.printStackTrace();
		}
		System.out.println("Continuando execução do programa...");
		
		System.out.println(agora.plusDays(9)); //soma 9 dias ao dia de hoje
		
		System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //soma 1 mês ao dia de hoje
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		System.out.println(agora.isLeapYear()); //verificar se é ano bissexto
		System.out.println(LocalDate.parse("2024-12-01").isLeapYear());
		
		// hora formato ISO
		LocalTime horaAgora = LocalTime.now(); //hora de agora
		System.out.println(horaAgora);
		
		System.out.println(LocalTime.of(16, 49));
		System.out.println(LocalTime.parse("16:50"));
		
		System.out.println(horaAgora.plusMinutes(30));
		System.out.println(horaAgora.minus(20, ChronoUnit.MINUTES));
		
		System.out.println(horaAgora.getHour());
		
		//data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(2021, 8, 18, 11, 54, 10));
		System.out.println(LocalDateTime.parse("2021-07-14T17:01:56"));
		System.out.println(agoraCompleto.plusYears(10));
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds(); //Set é uma lista de objetos que não se repetem
//		for (String f : fusos) {
//			System.out.println(f);
//		}
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2021-07-14T17:01:56"), sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2021-07-14T17:01:56-03:00[America/Sao_Paulo]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");//diferença de fuso horários
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);//data com o offset
		System.out.println(offsetdt);
		
		//converter um objeto Date ou Calendar para a API mais recente da linguagem
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		
		//licão de casa: comparar as APIs Date e Calendar com  LocalDate/LocalDateTime do Java 8
	}

}
