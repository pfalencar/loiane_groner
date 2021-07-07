package com.loiane.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal {
	
	private String alimento;
	
	public Mamifero () {
		super();
		super.setAmbiente("Terra");
	}
	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + this.alimento;
	}
}
