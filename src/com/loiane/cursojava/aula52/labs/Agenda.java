package com.loiane.cursojava.aula52.labs;

public class Agenda {
	
	private Contato[] contatos;
	
	
	public Agenda() {
		contatos = new Contato[5];		
	}
	
	
	public void adicionarContato(Contato contato) throws AgendaCheiaException {	
		
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato;
				cheia = false;
				break;
			} 	
		} 
		if (cheia) {
			throw new AgendaCheiaException();
		}	
		
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
	}


	@Override
	public String toString() {
		String s = "";
		for (Contato c: contatos) {
			s = s + c.toString() + "\n";
		}
		return s;
	}
	
	

}
