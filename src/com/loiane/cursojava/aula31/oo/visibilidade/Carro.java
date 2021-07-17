package com.loiane.cursojava.aula31.oo.visibilidade;

public class Carro {

	public String marca; //public: vis�vel para as outras classes do projeto
	String modelo; //default: visibilidade somente dentro do pacote
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; //private: vis�vel s� dentro da pr�pria classe
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro �:");
	}
	
	public double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return divideKMPorConsumoCombustivel(km);
	}
	
}
