package programa;

import util.Utils;

public class Conta {
	private static int contarDeContas = 1;
	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;

	public Conta(Pessoa pessoa) {

		this.numeroConta = contarDeContas;
		this.pessoa = pessoa;
		contarDeContas++;

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public String toString() {
		return "[\nConta: " + this.getNumeroConta() + 
				"\nNome:" + this.pessoa.getNome() +
				"\nCPF:" + this.pessoa.getCPF() +
				"\nEmail:" + this.pessoa.getEmail() +
				"\nSaldo:" + Utils.doubleToString(this.getSaldo()) + "]";
	}

}
