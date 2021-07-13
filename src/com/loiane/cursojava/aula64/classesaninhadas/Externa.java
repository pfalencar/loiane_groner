package com.loiane.cursojava.aula64.classesaninhadas;

//classe interna (static ou nao)

//classes que serão utilizadas somente dentro da classe "externa"
//Exemplo: Hibernate/JPA (chave primária composta)

public class Externa {

	private String texto = "texto externo";
	
	public class Interna {
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			System.out.printf("%s: %s","Atributo da classe interna", texto);
			System.out.println();
			//consegue ver membros da classe externa
			System.out.printf("%s: %s", "Atributo da classe externa", Externa.this.texto);
		}
	}
	
	public static void main(String[] args) {
		
		Externa externa = new Externa();
//		externa.new Interna().imprimeTexto();
		Interna interna = externa.new Interna();
		interna.imprimeTexto();
		
	}
}
