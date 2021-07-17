package com.loiane.cursojava.aula32.oo.encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setMarca("Fiat");
		System.out.println(carro.getMarca());
	}

}
