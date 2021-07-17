package com.loiane.cursojava.aula36.oo.relacionamento.ex02;

public class Teste {

	public static void main(String[] args) {

		Curso c1 = new Curso("ADS", "noturno");

		Professor p1 = new Professor("Joilson");
		p1.setDepartamento("Dados");
		p1.setEmail("joilson@gmail.com");
		c1.setProfessor(p1);

		Aluno[] alunos = new Aluno[3];
		
		Aluno aluno1 = new Aluno("Maria", "83893");
		double[] notas = {8.0, 9, 7.4, 9.8};
		aluno1.setNotas(notas);
		alunos[0] = aluno1;
		
		Aluno aluno2 = new Aluno("José", "12345");
		double[] notas2 = {3.0, 8.6, 9.1, 10};
		aluno2.setNotas(notas2);
		alunos[1] = aluno2;
		
		Aluno aluno3 = new Aluno("Roberta", "67890");
		double[] notas3 = {5.0, 4.6, 9.7, 10.1};
		aluno3.setNotas(notas3);
		alunos[2] = aluno3;

		c1.setAlunos(alunos);
		
		System.out.println(c1);
	}

}
