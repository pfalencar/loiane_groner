package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo: ");
//		String nomeCompleto = scan.nextLine(); //para ler uma linha inteira
//		System.out.println("Seu nome completo �: " + nomeCompleto);

//		System.out.println("Digite seu primeiro nome: ");
//		String primeiroNome = scan.next(); //vai ler somente o primeiro nome
//		System.out.println("Seu primeiro nome �: " + primeiroNome);

//		System.out.println("Digite sua idade: ");
//		int idade = scan.nextInt(); //l� um inteiro
//		System.out.println("Sua idade �: " + idade);

//		System.out.println("Digite sua altura: ");
//		double altura = scan.nextDouble(); //l� um double (v�rgula como separador decimal)
//		System.out.println("Sua altura �: " + altura);

		System.out.println("Digite seu primeiro nome, idade, qtde de filhos, altura e "
				+ "se tem bichinho de estima��o:");
		String primeiroNome = scan.next(); //l� separado por espa�o
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean hasPet = scan.nextBoolean();
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estima��o? " + hasPet);
		
	}

}
