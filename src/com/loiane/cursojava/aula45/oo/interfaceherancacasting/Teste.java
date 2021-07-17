package com.loiane.cursojava.aula45.oo.interfaceherancacasting;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		//ou
		Pessoa aluno2 = (Pessoa) new Aluno();
		

		Pessoa pessoa = new Pessoa();
		Aluno aluno3 = (Aluno) pessoa; //downcasting
	}

}
