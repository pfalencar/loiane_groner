package com.loiane.cursojava.aula56.labs;

public enum Calculadora {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return (x + y);
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return (x - y);
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return (x * y);
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return (x / y);
		}
	};
	
	private String simbolo;

	Calculadora(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public String getSimbolo() {return simbolo;}
	
	
	public abstract double executarOperacao(double x, double y); 

	
	@Override
	public String toString() {
		return this.simbolo;
	}
	
	
}
