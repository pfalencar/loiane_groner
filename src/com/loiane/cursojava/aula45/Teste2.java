package com.loiane.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		//exemplo 1: Ok - Downcasting de String
		//retorno do método pode referenciar String
		Object obj1 = obterString();
		String s1 = (String) obj1;		
		
		//exemplo 2: Ok - Upcasting
		//"obj2" referencia String explicitamente
		Object obj2 = "Minha String 2"; // Upcasting
		String s2 = (String) obj2;	
		
		//exemplo 3: FALHA em tempo de execução - Upcasting
		//"obj3" não faz referência a nenhuma String
//		Object obj3 = new Object();
//		String s3 = (String) obj3;
		
		//exemplo 3: FALHA em tempo de compilação - Upcasting
		//"obj4" nunca referencia String já que o retorno do método é int 
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;		
		
	}

	private static String obterString() {
		return "minha String método";
	}

	private static int obterInteiro() {
		return 1;
	}
}
