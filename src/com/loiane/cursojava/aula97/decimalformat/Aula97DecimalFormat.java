package com.loiane.cursojava.aula97.decimalformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//Tem mais precisão de casas decimais. Usado para moedas também
// Estende a NumberFormat
public class Aula97DecimalFormat {

	public static void main(String[] args) {

		System.out.println(Locale.getDefault());
		
		String padrao = "###,###.##";		
		DecimalFormat df = new DecimalFormat(padrao);
		
//		df.applyPattern(padrao);
		System.out.println(df.format(2873298732987.93940));
		
		
		//Trocando '.' por ',' e vice-versa
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "US"));
		System.out.println(Locale.getDefault());
		
		Locale.setDefault(new Locale("en", "US"));
		System.out.println(Locale.getDefault());
		
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');
		
		df = new DecimalFormat(padrao, dfs);
		System.out.println(df.format(2873298732987.93940));

		String padrao3 = "###,###,###.##"; 
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(2873298732987.93940));

		String padrao4 = "\u00A4###,###,000.00%"; 
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));
	}

}
