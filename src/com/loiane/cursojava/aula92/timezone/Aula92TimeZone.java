package com.loiane.cursojava.aula92.timezone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar agoraBerlin = Calendar.getInstance(tzBerlin);
		System.out.println(agoraBerlin.getTimeZone());
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);
		
		//nome de todos os fusos horários
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//			System.out.println(fuso);
//		}
		
		//Configurar um fuso horário padrão ou um diferente de onde o programa está sendo executado
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());
		
		//converter datas e salvar => pegando o horário de agora, converter e salvar em algum lugar como se fosse o horário do Brasil
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraSP = Calendar.getInstance(tzSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));
		
		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis()) / 1000 / 60 / 60);  // 1000ms=1s; 60s=1min; 60min=1h
		System.out.println(sdf.format(agoraSP.getTime()));
	}

}
