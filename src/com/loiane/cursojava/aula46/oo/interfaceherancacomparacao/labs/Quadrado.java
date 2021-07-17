package com.loiane.cursojava.aula46.oo.interfaceherancacomparacao.labs;

public class Quadrado extends Figura2D {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
//		return Math.pow(lado, 2);	
	}

	@Override
	public String toString() {
		return super.toString() +"\nLado: " + lado + "\n¡rea do quadrado: " + calcularArea();
	}
	
	

}
