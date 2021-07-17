package com.loiane.cursojava.aula96.numberformat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

//qdo não precisa de muita precisão decimal.
//Para precisão de moedas: decimalFormat
public class Aula96NumberFormat {

	public static void main(String[] args) throws ParseException {

		//1.000,00 - Brasil
		//1,000.00 - EUA
		
		Locale en = new Locale("en", "US");
		NumberFormat nf = NumberFormat.getInstance(en);		
		String num = nf.format(100.99);
		System.out.println(num);
		
		Locale br = new Locale("pt", "BR");
		nf = NumberFormat.getInstance(br);		
		num = nf.format(100.99);
		System.out.println(num);
		
		//MOEDA
		NumberFormat moeda = NumberFormat.getCurrencyInstance(br);
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		Currency currency  = moeda.getCurrency();
		System.out.println(currency);
		
		//PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(7);
		porcent.setMinimumIntegerDigits(5);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		//ARREDONDAMENTO
		nf = NumberFormat.getInstance(Locale.getDefault());
		System.out.println(Locale.getDefault());
		nf.setRoundingMode(RoundingMode.CEILING);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
		Number numero = nf.parse("100,300");
		System.out.println(numero.intValue());
	}

}
