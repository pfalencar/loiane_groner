package com.loiane.cursojava.aula57.wrappers;

public class FormatoNumeroException extends Exception {

	@Override
	public String getMessage() {
		return "N�mero com formato inv�lido.";
	}
}
