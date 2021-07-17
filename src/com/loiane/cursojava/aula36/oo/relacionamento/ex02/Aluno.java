package com.loiane.cursojava.aula36.oo.relacionamento.ex02;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas = new double[4];

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "\n[ nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + " ] ";
	}

	
	
}
