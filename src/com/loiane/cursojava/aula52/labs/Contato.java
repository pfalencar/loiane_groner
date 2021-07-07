package com.loiane.cursojava.aula52.labs;

public class Contato {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	
	public Contato() {
		contador++;
		this.id = contador;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

	
}
