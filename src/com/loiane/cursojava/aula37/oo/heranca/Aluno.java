package com.loiane.cursojava.aula37.oo.heranca;

public class Aluno  extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	
	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public double calcularMedia() {
		return 0.0;
	}
	
	public boolean verificarAprovacao() {
		return true;
	}

}
