package com.loiane.cursojava.aula43.oo.classeobject.labs.exer03;

public class Teste {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.setNome("Camelo");
		animal.setComprimento(150);
		animal.setCor("Amarelo");
		animal.setAmbiente("Terra");
		animal.setVelocidade(2);
		
		Peixe peixe = new Peixe();
		peixe.setNome("Tubarão");
		peixe.setComprimento(300);
		peixe.setVelocidade(1.5);
		
		Mamifero mamifero2 = new Mamifero();
		mamifero2.setNome("Urso-do-canadá");
		mamifero2.setComprimento(180);
		mamifero2.setCor("Vermelho");
		mamifero2.setVelocidade(0.5);
		mamifero2.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		animais[0] = animal;
		animais[1] = peixe;
		animais[2] = mamifero2;
		
		System.out.println("Zoo:");		
		System.out.println("-------------------");
		
		for (Animal a: animais) {
			System.out.println(a);
			System.out.println("-------------------");
		}
		
	}	

}
