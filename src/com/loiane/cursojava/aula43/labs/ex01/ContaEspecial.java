package com.loiane.cursojava.aula43.labs.ex01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public ContaEspecial() {}
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) { 
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {	return limite; }
	public void setLimite(double limite) { this.limite = limite; }
	
	@Override
	public String toString() {
		return super.toString() + ". ContaEspecial [limite=" + limite + "]";
	}

	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		if ((saldoComLimite - valor) >= 0 ) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
		
	}

}