package com.loiane.cursojava.aula46.oo.interfaceherancacomparacao;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{

	void abrirConexao();
	void fecharConexao();
	
}
