package com.loiane.cursojava.aula54.enumclasse;

import com.loiane.cursojava.aula54.enumclasse.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SABADO;
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(6, 7, 2021, DiaSemana.SEGUNDA);
		System.out.println(data);
		
		Formulario formulario = new Formulario("Maria", Genero.FEMININO);
		System.out.println(formulario.toString());
		
		Formulario form = new Formulario("José", Genero.MASCULINO);
		System.out.println("Nome: " + form.getNome() + ", Gênero: " + form.getGenero());
		System.out.println("Nome: " + form.getNome() + ", Gênero: " + form.getGenero().getValor());
	}
	
	

}
