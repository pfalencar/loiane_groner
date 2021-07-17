package com.loiane.cursojava.aula36.oo.relacionamento.ex01;

import java.util.Arrays;

public class Agenda {
	//1 agenda tem * contatos
	private Contato[] contatos;
	private String nome;
	
	
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome da agenda: " + nome + "\n";
		if (contatos != null) {
			for (Contato c: contatos) {
				info +=c.obterInfo() + "\n";
			}
		}
		return info;
	}
	
	@Override
	public String toString() {
		return "Agenda [contatos=" + Arrays.toString(contatos) + ", nome=" + nome + "]";
	}
	
	

}
