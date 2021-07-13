package com.loiane.cursojava.aula64.classesaninhadas;

//classe interna: an�nima
//� qdo a gente instancia a classe e muda o seu comportamento qdo estamos instanciando

//usada com Colletions (comparar objetos, entre outros)
public class Anonima {

	public void imprimeTexto() {
		System.out.println("qualquer texto");
	}
	
	
	public static void main(String[] args) {
		
		Anonima anonima = new Anonima(){ //adicionando um corpo para a classe
			public void imprimeTexto(){ //sobreescrevendo comportamento da classe
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//classes an�nimas podem implementar interfaces
		//usando interfaces
		//� poss�vel instanciar uma interface usando classe an�nima
		Texto texto = new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}

}
