package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		int opcao = 1;
		
		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {			
				case 1:
					consultarContato(scan, agenda);
					break;					
				case 2:
					adicionarContato(scan, agenda);
					break;					
				case 3:
					System.out.println("Sistema Finalizado.");
					System.exit(0);					
				default:
					System.out.println("Entrada inválida. Digite 0, 1 ou 2:\n");
			}
		}
	}
	

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
			System.out.println("Criando um contato, entre com as informações");
			String nome = lerInformacaoString(scan, "Digite o nome do novo contato: ");
			String telefone = lerInformacaoString(scan, "Digite o telefone do novo contato: ");

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);

			System.out.println("Contato a ser criado: ");
			System.out.println(contato);

			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}

	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Digite o nome do contato para consulta: ");
		try {
			if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe.");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Consultar um contato por nome");
			System.out.println("2: Adicionar um contato na agenda");
			System.out.println("3: Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n");
			}
		}
		return opcao;
	}

}
