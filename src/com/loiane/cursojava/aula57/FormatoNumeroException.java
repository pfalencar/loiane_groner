package com.loiane.cursojava.aula57;

public class FormatoNumeroException extends Exception {

	@Override
	public String getMessage() {
		return "Número com formato inválido.";
	}
}
