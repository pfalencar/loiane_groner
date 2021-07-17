package com.loiane.cursojava.aula55.enummetodos;

import com.loiane.cursojava.aula53.enumeradores.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//no lugar da String "QUARTA" posso ter uma variável e transformá-la num enum para comparar com outro, etc.
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "QUARTA");
		System.out.println(dia);
	}

}
