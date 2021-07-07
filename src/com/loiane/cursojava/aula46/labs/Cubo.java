package com.loiane.cursojava.aula46.labs;

public class Cubo extends Figura3D {

	private double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * (lado*lado);
//		return 6 * Math.pow(lado, 2);		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLado: " + lado + "\n¡rea do cubo: " + calcularArea()
		+ "\nVolume do cubo: " + calcularVolume();
	}

}
