package com.loiane.cursojava.aula60.escopovariaveis;

public class TesteEscopoVariaveis {

	public static void main(String[] args) {

		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);
//		System.out.println(escopo.getValor());
//		System.out.println(escopo.calculaValor(20));
//		System.out.println(escopo.getValor());
//		System.out.println(escopo.teste());
//		System.out.println(escopo.getValor());
//		escopo.outroTeste();
//		escopo.maisUmTeste();
		escopo.maisOutroTeste(2);
	}

}
