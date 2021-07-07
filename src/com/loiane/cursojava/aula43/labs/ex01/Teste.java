package com.loiane.cursojava.aula43.labs.ex01;

import java.time.LocalDate;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria("Cliente Conta Simples", "123", 1000.0);
		System.out.println(contaSimples.toString());
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 500.0);
		realizarSaque(contaSimples, 600.0);
		realizarSaque(contaSimples, 500.0);
		
		contaSimples.depositar(600.0);
		System.out.println("Saldo = " + contaSimples.getSaldo());
		
		realizarSaque(contaSimples, 600.0);
		
		
		System.out.println("\n*** Teste ContaPoupança ***");
		ContaPoupanca contaPoupanca = new ContaPoupanca("Cliente Conta Poupança", "234", 0.0, 30);
		System.out.println(contaPoupanca);
		contaPoupanca.depositar(250);
		realizarSaque(contaPoupanca, 200);
		realizarSaque(contaPoupanca, 60);
		
		calcularSaldoComTaxaRendimento(contaPoupanca, 0.5);
		

		System.out.println("\n*** Teste ContaEspecial ***");
		ContaEspecial contaEspecial = new ContaEspecial("Cliente Conta Especial", "567", 0.0, 50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}
	
	private static void calcularSaldoComTaxaRendimento(ContaPoupanca contaPoupanca, double taxaRendimento) {
		if (contaPoupanca.calcularNovoSaldo(taxaRendimento)) {
			System.out.println("Rendimento aplicado, novo saldo é de R$ " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
		}
	}
	
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso. Novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de "+valor+"; saldo de = "+conta.getSaldo());
		}
	}

}
