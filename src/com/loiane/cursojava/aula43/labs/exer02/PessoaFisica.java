package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}

	
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if (renda <= 1400) {
			return 0;
		} 
		if (renda > 1400 && renda <= 2100) {//deduzir 100
			return (0.1 * renda) - 100;			
		} 
		if (renda >= 2100.01 && renda <= 2800) {//deduzir 270
			return (0.15 * renda) - 270;			
		}
		if (renda >= 2800.01 && renda <= 3600) {//deduzir 500
			return (0.25 * renda) - 500;
		} 
		return (0.3 * renda) - 700; // Maior que 3600. Deduzir 700
	}
	@Override
	public String toString() {
		return "Pessoa Física [" + super.toString() + ", cpf=" + cpf 
				+ ", imposto a ser pago: " + calcularImposto() + "]";
	}
	
	
}
