package com.loiane.cursojava.aula46.labs;

public class Piramide extends Figura3D {

	private double arestaBase;
	private double alturaPiramide;
	
	private Figura2D base;
	
	
	public Piramide(double arestaBase, double alturaPiramide, Figura2D base) {
		this.arestaBase = arestaBase;
		this.alturaPiramide = alturaPiramide;
		this.base = base;
	}
	
	@Override
	public double calcularVolume() {
		if (base != null) {
			return ( base.calcularArea() * alturaPiramide ) / 3;
		}
		return 0;
	}

	@Override
	public double calcularArea() { //arrumar esta conta!!!
		if (base != null) {
			double area =  (4 * calcularAreaFaceLateral()) + base.calcularArea();
			return area;
		}
		return 0;
	}

	private double calcularAreaFaceLateral() {
		double apotemaBase = arestaBase/2;
		double alturaFaceLateral = Math.sqrt(Math.pow(apotemaBase, 2) + Math.pow(alturaPiramide, 2)); 		
		double areaFaceLateral = (arestaBase * alturaFaceLateral) / 2;
		return areaFaceLateral;
	}	

}
