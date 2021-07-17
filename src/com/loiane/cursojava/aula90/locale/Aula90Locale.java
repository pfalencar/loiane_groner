package com.loiane.cursojava.aula90.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		//dd/MM/yyyy => no Brasil => 02/01/2000
		//MM/dd/yyyy => nos EUA   => 01-fev-2000
		
		//1.000,02 => no Brasil
		//1,000.02 => nos EUA
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale locale2 : locales) {
			System.out.println("Nome: " +locale2.getDisplayName()+ " - " + locale2);
			System.out.println("Código da língua: " + locale2.getLanguage());
			System.out.println("Nome da língua: " + locale2.getDisplayLanguage());
			System.out.println("Código país: " + locale2.getCountry());
			System.out.println("País: " + locale2.getDisplayCountry());
			System.out.println("************************************************");
		}
		
		Locale br = new Locale("pt", "BR");
		System.out.println(br);
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.printf(nf.format(492097d));
		
		System.out.println();
		
		Locale en = new Locale("en", "US");
		System.out.println(en);
		Locale.setDefault(en);
		System.out.println(Locale.getDefault());
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.printf(nf1.format(492097d));
		
		System.out.println();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.printf(nf2.format(492097d));
		
	}

}
