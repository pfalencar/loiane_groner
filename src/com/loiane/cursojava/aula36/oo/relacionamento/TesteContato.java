package com.loiane.cursojava.aula36.oo.relacionamento;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("pati");
		
		//relacionamento tem-muitos telefones
		Telefone tel0 = new Telefone();
		tel0.setTipo("celular");
		tel0.setDdd("11");
		tel0.setNumero("9 3872-9392");
		
		Telefone tel1 = new Telefone();
		tel1.setTipo("casa");
		tel1.setDdd("11");
		tel1.setNumero("4903-3982");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("trabalho");
		tel2.setDdd("11");
		tel2.setNumero("4903-3982");
		
		Telefone[] telefones = new Telefone[3];
		telefones[0] = tel0;
		telefones[1] = tel1;
		telefones[2] = tel2;
		
		contato.setTelefones(telefones);
		
		
		//relacionamento tem-um endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Av. Paulista");
		endereco.setNumero("1000");
		endereco.setComplemento("apto. 8");
		endereco.setCep("01010-010");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		contato.setEndereco(endereco);

		//Teste saída do contato
//		System.out.println(contato.toString());

		System.out.println(contato.getNome());
		
		if (contato != null || contato.getTelefones() != null) {
			for (Telefone telefone : contato.getTelefones()) {
				System.out.println(telefone.getTipo() + ": " + telefone.getDdd() + " " + telefone.getNumero());	
			}
			
		}
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
	}

}
