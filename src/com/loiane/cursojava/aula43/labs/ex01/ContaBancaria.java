package com.loiane.cursojava.aula43.labs.ex01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {}	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() { return nomeCliente; }
	public void setNomeCliente(String nomeCliente) {this.nomeCliente = nomeCliente;	}
	
	public String getNumConta() {	return numConta; }
	public void setNumConta(String numConta) {	this.numConta = numConta;}
	
	public double getSaldo() { return saldo; }
	public void setSaldo(double saldo) { this.saldo = saldo; }
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	
}
