package com.loiane.cursojava.aula58.autoboxing;

//se vc for trabalhar mais com expressões, melhor usar tipos primitivos e fazer o boxing no final.
public class TesteAutoboxing {

	public static void main(String[] args) {

		//autoboxing
		Short num7 = 1; // new Short((short) 1);
		Byte num8 = 10; //new Byte((byte) 10);
		Integer num9 = 100; //new Integer(100);
		Long num10 = 10000l; //new Long(10000l);
		Float num11 = 3.5f; // new Float(3.5f);
		Double num12 = 3.555; //new Double(3.555);
		Boolean flag2 = true; //new Boolean(true);
		Character b_ = 'b'; //new Character('b');
		
		//auto un-boxing
		int num13 = num9;  //num9.intValue();
		
		//autoboxing em expressões
		num9++;
		System.out.println(++num9);
		
		
		// int:100 / Integer:100 (unboxing), daí vira int 100 = int 1 (boxing) pra entrar no Integer num14.
		Integer num14 = num13 / num9; 
		System.out.println(num14);
		
		//mau uso:
		Double a, b, c;
		//é feito o autoboxing de todos esses valores:
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		//unboxing de a, b, c para números primitivo, 
		//será feita a expressão de divisão por 3 e depois pega o resultado da expressão e
		//boxing para atribuir para o tipo Double media, que representa um objeto.
		Double media = (a + b + c) / 3;
		System.out.println(media);
		
		
	}

}
