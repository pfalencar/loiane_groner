package com.loiane.cursojava.aula52.labs.teste;

public class Teste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		menu();
		consultarContatoAgenda(agenda);
		adicionarContatoAgenda(agenda);
		
	}

	private static void adicionarContatoAgenda(Agenda agenda) {
		agenda.adicionarContato();
	}

	private static void consultarContatoAgenda(Agenda agenda) {
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		
	}

}
