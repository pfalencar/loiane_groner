package com.loiane.cursojava.aula43.oo.classeobject.labs.exer02;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;
	
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}

	@Override
	public double calcularImposto() {
		return 0.1 * this.getRendaBruta();
	}
	@Override
	public String toString() {
		return "Pessoa Jurídica [" + super.toString() + ", cnpj=" + cnpj +
				", imposto a ser pago: " + calcularImposto() + "]";
	}

	
}
