package com.loiane.cursojava.aula36.oo.relacionamento.ex01;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o nome da agenda: ");
		String nomeAgenda = scan.nextLine();

		agenda.setNome(nomeAgenda);

		System.out.println("**** Entre com 3 contatos ****");
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i+1) + " :");
			
			Contato contato = new Contato();
			
			System.out.println("Entre com o nome: ");
			String nomeContato = scan.nextLine();
			contato.setNome(nomeContato);
			
			System.out.println("Entre com o telefone: ");
			String telefoneContato = scan.nextLine();
			contato.setTelefone(telefoneContato);
			
			System.out.println("Entre com o email: ");
			String emailContato = scan.nextLine();
			contato.setEmail(emailContato);		
			
			contatos[i] = contato;
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
			
		}
	
		

//		System.out.println("Nome agenda: " + agenda.getNome());
//
//		if (contatos != null && agenda.getContatos() != null) {
//			for (Contato contato : agenda.getContatos()) {
//				if (contato != null) {
//					System.out.println("-----------------------------------");
//					System.out.println(contato.toString());
//				}
//			}
//		}
	}

}
