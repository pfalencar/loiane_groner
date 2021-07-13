package com.loiane.cursojava.aula85.math;

public class Aula85Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.round(4.7));//se acima do 4.5 arredonda pra cima
		System.out.println(Math.round(4.4));//se abaixo do 4.5 arredonda pra baixo
		
		System.out.println(Math.ceil(4.4));//sempre arredonda para o inteiro acima
		System.out.println(Math.ceil(4.7));//sempre arredonda para o inteiro acima
		
		System.out.println(Math.floor(4.4));//sempre arredonda para o inteiro abaixo
		System.out.println(Math.floor(4.7));//sempre arredonda para o inteiro abaixo
		
		System.out.println(Math.round(Math.random() * 10));
		
		System.out.println( Math.sin( Math.toRadians(30) ) );
		System.out.println( Math.cos( Math.toRadians(180) ) );
		System.out.println( Math.tan( Math.toRadians(45) ) );
	}

}
