package com.loiane.cursojava.aula44.oo.interfaces;

public interface Constantes {
	
	//todos os atributos de uma interface são "public final" 
		//qdo um atributo é final, ele se torna uma constante, portanto, tudo em maiúsculo.
//		public final int ANO = 2016;

	//assim está na aula42, dentro de uma classe "final", usada para por todas as ctes.
//	public static final String URL_BLOG = "http://loiane.com";
//	public static final String URL_CURSO_COMPLETO = "http://loiane.training";
	
	//em uma interface todo o atributo já são "public static final"
	String URL_BLOG = "http://loiane.com";
	String URL_CURSO_COMPLETO = "http://loiane.training";
}
