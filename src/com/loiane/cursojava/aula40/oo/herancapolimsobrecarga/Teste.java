package com.loiane.cursojava.aula40.oo.herancapolimsobrecarga;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua da pessoa, 1");
		aluno.setEndereco("Rua do aluno, 2");
		professor.setEndereco("Rua do professor, 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
	}

}
