package com.dio.desafio.banco;

public class Banco implements Tipos{
	
	private static final int agencia = 13;
	private int numero;
	private double saldo;
	private tipoConta tipo;
	protected enum tipoConta{
		Corrente, Poupanca;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public tipoConta getTipo() {
		return tipo;
	}
	public void setTipo(tipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public void sacar(double saldo) {
		this.saldo = saldo;
		
	}
	@Override
	public void depositar(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public void transferir(double valor, int conta) {
		
	}
	
}
