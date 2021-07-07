package com.loiane.cursojava.aula46.labs;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (( base * altura ) / 2);
	}

	@Override
	public String toString() {
		return super.toString() + "\nBase: " + base + "\nAltura: " + altura 
				+ "\n¡rea do Tri‚ngulo: " + calcularArea();
	}
	
	


}
