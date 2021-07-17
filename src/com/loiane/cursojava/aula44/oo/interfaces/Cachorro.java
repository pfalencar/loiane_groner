package com.loiane.cursojava.aula44.oo.interfaces;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{

	private int tamanho;
	private String raca;
	
	public int getTamanho() {return tamanho;}
	public void setTamanho(int tamanho) {this.tamanho = tamanho;}
	public String getRaca() {return raca;}
	public void setRaca(String raca) {this.raca = raca;}

	@Override
	public void amamentar() {		
	}

	@Override
	public void emitirSom() {		
	}
	
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void alimentar() {
		
	}
	@Override
	public void levarVeterinario() {
		
	}
	@Override
	public void chamarVeterinario() {
		
	}

}
