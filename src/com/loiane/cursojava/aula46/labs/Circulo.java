package com.loiane.cursojava.aula46.labs;

public class Circulo extends Figura2D {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return raio * raio * Math.PI;
//		return Math.PI * (Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return super.toString() + "\nRaio: " + raio + "\nÁrea do círculo: "+ calcularArea();
	}
	
	

}
