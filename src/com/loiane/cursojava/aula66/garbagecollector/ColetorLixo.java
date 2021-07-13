package com.loiane.cursojava.aula66.garbagecollector;

import com.loiane.cursojava.aula61.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		// 1024 bytes = 1kb
		// 1024kb = 1MB
		// 1024MB = 1GB
		// 1024GB = 1TB
		
		final int MB = 1024 * 1024; 
		
		Runtime runtime = Runtime.getRuntime(); //singleton: permite ter só 1 instância da classe para todo o projeto
		long memoriaUtilizada = runtime.totalMemory() - runtime.freeMemory();// freeMemory() em bytes
		System.out.println("Memória utilizada: " + (memoriaUtilizada/MB) + " MB");
		
	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[10000000];
		Contato contato;
		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato"+i,"1234-5678"+i,"contato"+i+"@egmail.com" );
			contatos[i] = contato;
			System.out.println(contato);
		}
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null; //removendo a referência desse objeto na memória.
		
		Runtime.getRuntime().runFinalization(); //estou marcando o que é lixo para o garbage collector
		
		Runtime.getRuntime().gc(); //pedindo para o garbage collector ser executado. Porém, não é garantido que ele será executado.
		
		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();
	}

}
