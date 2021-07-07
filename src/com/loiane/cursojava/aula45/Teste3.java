package com.loiane.cursojava.aula45;

public class Teste3 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("Objeto do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno) {
			System.out.println("Objeto do tipo Aluno");
		}
		
		if (professor instanceof Professor) {
			System.out.println("Objeto do tipo Professor");
		}
	}

}
