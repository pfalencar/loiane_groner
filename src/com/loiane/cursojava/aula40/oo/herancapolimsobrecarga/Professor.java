package com.loiane.cursojava.aula40.oo.herancapolimsobrecarga;

public class Professor extends Pessoa{

	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "safojos";
		super.nomeVisibilidade = "iasodij";
		
		this.setNomeVisibilidade("asodfioiu");
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		return 0.0;
	}
	
public String obterEtiquetaEndereco() {
		
		String s = "Endereço do professor: ";
		s += super.getEndereco();
		return s;
	}
}
