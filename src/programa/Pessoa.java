package programa;

public class Pessoa {
	
	private static int couter = 1;
	
	private String  nome;
	private String cpf;
	private String email;
	
	
	public Pessoa(String nome, String cpf, String email) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		couter++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cPF) {
		this.cpf = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
