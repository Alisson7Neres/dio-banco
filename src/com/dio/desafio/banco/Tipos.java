package com.dio.desafio.banco;

public interface Tipos {
	
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, int conta);

}
