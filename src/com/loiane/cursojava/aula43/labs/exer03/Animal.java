package com.loiane.cursojava.aula43.labs.exer03;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.patas = 4;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		return "Animal: " + this.nome + "\nComprimento: " + this.comprimento + " cm" + 
				"\nPatas: " + this.patas + "\nCor: " + this.cor + 
				"\nAmbiente: " + this.ambiente + "\nVelocidade: " + this.velocidade + " m/s";
	}
}
