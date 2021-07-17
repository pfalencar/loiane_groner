package com.loiane.cursojava.aula43.oo.classeobject.labs.exer02;

public class TesteImpostoRenda {

	private static double imposto;

	public static void main(String[] args) {
		
		//*** Pessoa Jurídica ***		
		PessoaJuridica pj1 = new PessoaJuridica();
		PessoaJuridica pj2 = new PessoaJuridica();
		PessoaJuridica pj3 = new PessoaJuridica();
		
		pj1.setNome("Bar e Mercearia Irmãos Alencar");
		pj1.setCnpj("3.0001/37");
		pj1.setRendaBruta(10000.0);
		
		pj2.setNome("Padaria Torre de Belém");
		pj2.setRendaBruta(50000.0);
		pj2.setCnpj("9.0001/84");
		
		pj3.setNome("Supermercado Santa Luzia");
		pj3.setRendaBruta(280000.01);
		pj3.setCnpj("2892.0001/30");
		
		//*** Pessoa Física ***
		PessoaFisica pf1 = new PessoaFisica();
		PessoaFisica pf2 = new PessoaFisica();
		PessoaFisica pf3 = new PessoaFisica();
		
		pf1.setNome("Maria");
		pf1.setRendaBruta(5000.0);
		pf1.setCpf("234.938-98");
		
		pf2.setNome("João");
		pf2.setRendaBruta(2100.01);
		pf2.setCpf("289.833-09");
		
		pf3.setNome("Lombardi");
		pf3.setRendaBruta(1500.50);
		pf3.setCpf("928.038-00");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = pj1;
		contribuintes[1] = pj2;
		contribuintes[2] = pj3;
		contribuintes[3] = pf1;
		contribuintes[4] = pf2;
		contribuintes[5] = pf3;
		
		for (Contribuinte c: contribuintes) {
			System.out.println(c);
		}
	
	}

}
