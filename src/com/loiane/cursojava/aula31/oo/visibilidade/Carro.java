package com.loiane.cursojava.aula31.oo.visibilidade;

public class Carro {

	public String marca; //public: visível para as outras classes do projeto
	String modelo; //default: visibilidade somente dentro do pacote
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; //private: visível só dentro da própria classe
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é:");
	}
	
	public double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return divideKMPorConsumoCombustivel(km);
	}
	
}
