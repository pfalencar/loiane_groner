package com.loiane.cursojava.aula46.labs;

public class Cilindro extends Figura3D {
	
	private double raio;
	private double altura;
		
	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		double areaBase = Math.PI * (raio * raio);
		return (areaBase * altura);
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = (2 * Math.PI * raio * altura);
		double areaTotal = ((2 * areaBase) + areaLateral);
		return areaTotal;
	}

}
