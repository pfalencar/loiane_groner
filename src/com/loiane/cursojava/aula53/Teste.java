package com.loiane.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
//		usarConstantes();
		System.out.println();
		usarEnum();
	}
	
	private static void usarEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java");
		imprimirDiaSemana(segunda);
		imprimirDiaSemana(terca);
		imprimirDiaSemana(quarta);
		imprimirDiaSemana(quinta);
		imprimirDiaSemana(sexta);
		imprimirDiaSemana(sabado);
		imprimirDiaSemana(domingo);
		
	}

	private static void usarConstantes() {
		System.out.println("Teste utilizando constantes no Java");
//		imprimirDiaSemana(DiaSemanaConstantes.SEGUNDA);
//		imprimirDiaSemana(DiaSemanaConstantes.TERCA);
//		imprimirDiaSemana(DiaSemanaConstantes.QUARTA);
//		imprimirDiaSemana(DiaSemanaConstantes.QUINTA);
//		imprimirDiaSemana(DiaSemanaConstantes.SEXTA);
//		imprimirDiaSemana(DiaSemanaConstantes.SABADO);
//		imprimirDiaSemana(DiaSemanaConstantes.DOMINGO);
	}
	
	private static void imprimirDiaSemana(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
}
