package com.dio.desafio.banco;

public class Cliente extends Banco{
	
	private String nome;
	private String CPF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
}
