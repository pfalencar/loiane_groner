package com.loiane.cursojava.aula54.enumclasse;

public enum DiaSemana {
	
	//static final DiaSemana SEGUNDA = new DiaSemana(1);
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), 
	SEXTA(5), SABADO(6), DOMINGO(7);

	private int valor;

	private DiaSemana(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	
}
