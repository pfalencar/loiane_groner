package com.loiane.cursojava.aula95.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

//Resource Bundle: arquivos para ajudar a obter configurações de acordo com o locale da aplicação
//tb serve para localizar ou internacionalizar o projeto

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual: " + Locale.getDefault());
		
		Locale.setDefault(new Locale("en_US", "en_US"));
		System.out.println("Locale atual: " + Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Hello EN: " + rb.getString("hello"));
		System.out.println("World: " + rb.getString("world"));
		
		System.out.println();
		
		Locale.setDefault(new Locale("pt_Br", "pt_Br"));
		System.out.println("Locale atual: " + Locale.getDefault());
		rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));
		
		System.out.println();
		
		//espanhol_Argentina
		rb = ResourceBundle.getBundle("meu-texto", new Locale("es_AR", "es_AR"));
		System.out.println("Locale atual: " + Locale.getDefault());
		System.out.println("Hola es_AR: " + rb.getString("hello"));
		System.out.println("Mundo es_AR: " + rb.getString("world"));
		
		System.out.println();
		
		//Deutsche_Deutschland (Alemanha): de_DE 
		Locale.setDefault(new Locale("de_DE", "de_DE"));
		System.out.println("Locale atual: " + Locale.getDefault());
		rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Hallo de_DE: " + rb.getString("hello"));
		System.out.println("Welt de_DE: " + rb.getString("world"));
	}

}
