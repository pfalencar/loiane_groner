package com.loiane.cursojava.aula43.labs.ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;
	
	public ContaPoupanca() {}
	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) { 
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento; 
		}

	public int getDiaRendimento() { return diaRendimento; }

	public void setDiaRendimento(int diaRendimento) { this.diaRendimento = diaRendimento; }
	
	@Override
	public String toString() {
		return super.toString() + ". ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			double novoSaldo = (1 + taxaRendimento) * this.getSaldo();
			this.setSaldo(novoSaldo);  
			return true;
		}
		return false;
	}
	
	
}
