package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values(); //retorna um array de todos os valores que estão no enum
		
		for(DiaSemana d: dias) {
			System.out.println(d);
		}
		System.out.println();
		
		for(DiaSemana d: DiaSemana.values()) {
			System.out.println(d);
		}
	}

}
