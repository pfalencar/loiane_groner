package com.loiane.cursojava.aula46.oo.interfaceherancacomparacao;

public interface SqlDML {
	
	void insert(String query);
	void update(String query);
	void delete(String query);
	void select(String query);

}
