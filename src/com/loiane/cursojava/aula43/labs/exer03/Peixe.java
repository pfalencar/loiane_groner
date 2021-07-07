package com.loiane.cursojava.aula43.labs.exer03;

public class Peixe extends Animal {
	
	private String caracteristicas;
	
	public Peixe() {
		super();
		super.setPatas(0);
		super.setCor("Cinzento");
		super.setAmbiente("Mar");
		this.caracteristicas ="Barbatanas e cauda";
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaracteristicas: " + this.caracteristicas;
	}
}
