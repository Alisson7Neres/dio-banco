package com.dio.desafio.banco;

import java.util.Scanner;

public class Painel extends Banco {

	Cliente c = new Cliente();
	Cliente c2 = new Cliente();

	void cadastro() {

		c.setNome("Alisson Neres Ribeiro");
		c.setCPF("000.111.222-34");
		c.setSaldo(3000d);
		c.setNumero(487987);
		c.setTipo(tipoConta.Poupanca);
		
		c2.setNome("Vito Scaletta");
		c2.setCPF("878.112.242-14");
		c2.setSaldo(10000d);
		c2.setNumero(879254);
		c2.setTipo(tipoConta.Corrente);

	}

	void mostrar() {
		cadastro();

		System.out.println(
				"Titular: " + c.getNome() + "\nCPF: " + c.getCPF() + String.format("\nSaldo: R$%.2f", c.getSaldo())
						+ "\nAgência: " + c.getAgencia() + "\nConta: " + c.getNumero() + "\nTipo: " + c.getTipo());
	}

	void acao() {

		mostrar();
		while (true) {
			
			System.out.println("\nDigite: " + "\n1 - sacar" + "\n2 - depositar" + "\n3 - transferir" + "\n4 - sair\n");
			System.out.print("Opção: ");
			Scanner scanner = new Scanner(System.in);
			int acao = scanner.nextInt();
			
			System.out.println();

			switch (acao) {
			case 1:
				System.out.print("sacar" + "\nDigite o valor: ");
				double sacar = scanner.nextDouble();
				System.out.println(String.format("Saldo: R$%.2f", c.getSaldo() - sacar));
				break;
			case 2:
				System.out.print("depositar" + "\nDigite o valor: ");
				double depositar = scanner.nextDouble();
				c.depositar(depositar + c.getSaldo());
				System.out.println(String.format("Saldo: R$%.2f", c.getSaldo()));
				break;
			case 3:
				System.out.print("transferir" + "\nDigite o valor e o número da conta destino: ");
				double transferir = scanner.nextDouble();
				int destino = scanner.nextInt();
				Conta conta = new Conta();
				c.transferir(transferir, destino);
				destino += conta.getNumero();
				System.out.println(String.format("Saldo: R$%.2f", c.getSaldo() - transferir));
				break;
			case 4:
				scanner.close();
				System.exit(0);
			default:
				System.err.println("Operação inválida!");
			}
		}
	}
}
