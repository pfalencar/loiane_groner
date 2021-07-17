package com.loiane.cursojava.aula36.oo.relacionamento.ex02;

import java.util.Arrays;

public class Curso {
	
	private String nome;
	private String horario;	
	//1 curso tem 1 professor
	private Professor professor;	
	//1 curso pode ter * Alunos
	private Aluno[] alunos;

	public Curso(String nome, String horario) {
		this.nome = nome;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", horario=" + horario + ", \nprofessor=" + professor + ", \nalunos="
				+ Arrays.toString(alunos) + "\n]";
	}
	
	
	

}
