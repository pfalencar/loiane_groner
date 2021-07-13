package com.loiane.cursojava.aula64.classesaninhadas;

//classe interna: anônima
//é qdo a gente instancia a classe e muda o seu comportamento qdo estamos instanciando

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
		
		//classes anônimas podem implementar interfaces
		//usando interfaces
		//é possível instanciar uma interface usando classe anônima
		Texto texto = new Texto() {
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}

}
