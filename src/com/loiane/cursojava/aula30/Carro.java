package com.loiane.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é:" + this.capCombustivel * this.consumoCombustivel);
	}
	
	double obterAutonomia() {
		return this.consumoCombustivel;
		// km / combustivel
	}
}
