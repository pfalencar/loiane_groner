package com.loiane.cursojava.aula43.oo.classeobject;

import java.util.Arrays;

import com.loiane.cursojava.aula42.oo.finalconstantes.Pessoa;

public class Aluno{
	
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
//		this.nomeVisibilidade = "safojos";
//		super.nomeVisibilidade = "iasodij";
		
//		this.setNomeVisibilidade("asodfioiu");
	}
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
//		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
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

	public void metodoQualquer() {
//		this.setCpf("82980920");
//		super.setCpf("339809428");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do aluno: ";
//		s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		return false;
	}
	
	
}
