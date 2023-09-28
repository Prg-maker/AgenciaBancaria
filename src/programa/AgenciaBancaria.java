package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Conta> contasBancarias;

	public static void main(String[] args) {
		contasBancarias = new ArrayList<Conta>();

		operacoes();
	}

	public static void operacoes() {
		System.out.println("------------------------------------------------------");
		System.out.println("-------------Bem vindos a nossa Agência---------------");
		System.out.println("------------------------------------------------------");
		System.out.println("***** Selecione uma operação que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - Criar conta   |");
		System.out.println("|   Opção 2 - Depositar     |");
		System.out.println("|   Opção 3 - Sacar         |");
		System.out.println("|   Opção 4 - Transferir    |");
		System.out.println("|   Opção 5 - Listar        |");
		System.out.println("|   Opção 6 - Sair          |");

		int operacao = input.nextInt();

		switch (operacao) {
		case 1: {
			criarConta();
			break;
		}
		case 2: {
			depositar();
			break;
		}
		case 3: {
			sacar();
			break;
		}
		case 4: {
			transferir();
			break;
		}
		case 5: {
			listar();
			break;
		}
		case 6: {
			System.out.println("Acabou");
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacao);
			operacoes();
			break;
		}
	}
	
	public static void criarConta() {
		System.out.println("\nNome: ");
		String nome = input.next();
		
		System.out.println("\nCPF: ");
		String cpf = input.next();
		
		
		System.out.println("\nEmail: ");
		String email = input.next();
		
		Pessoa pessoa = new Pessoa(nome, cpf , email);
		
		Conta conta = new Conta(pessoa);
		
		contasBancarias.add(conta);
		
		System.out.println("Sua Conta foi criada com sucesso!");
		
	}
	
	private static Conta encontrarConta(int numeroConta) {
		
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for(Conta cc : contasBancarias) {
				if(cc.getNumeroConta() == numeroConta) {
					conta = cc;
				}
			}
		}
		
		return conta;
	}
	
	private static void depositar() {
		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if(conta!= null) {
			System.out.println("Qual o valor deseja depositar: ");
			Double valordepositar = input.nextDouble();
			conta.depositar(valordepositar);
		}else {
			System.out.println("A conta não foi encontrada");
		}
		
		operacoes();
	}
	
	
}
