package com.loiane.cursojava.aula60.escopovariaveis;

public class EscopoVariaveis {
	
	private int valor;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int calculaValor(int valor) {
		valor = valor + 10;
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		if (true) {
			valor--;
		}
//		this.valor = valor; //referencia valor global/atributo da classe
		return valor;
	}
	
	public void outroTeste() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
//		i++; //erro de compilação
		
		System.out.println("");
		int j;
		for(j = 0; j < 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println("\n"+ j); //j tem valor 10.
	}
	
	public void maisUmTeste() {
		boolean flag = true;
		if(flag) {
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
//		System.out.println(umaVariavel); //erro de compilação
	}
	
	public void maisOutroTeste(int num) {
		int total = 0;
		try {
			int outroNum = 0;
			total = num / outroNum;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			total++;
//			outroNum++;  //erro de compilação
//			e.printStackTrace(); //erro de compilação
		}
		System.out.println(total);
		num++;
//		outroNum++; //erro de compilação
//		e.printStackTrace(); //erro de compilação
		System.out.println(num);
	}

	
}
