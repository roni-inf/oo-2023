package br.com.senai.revisao;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String email;

//OVERLOAD -SOBRECARGA	
	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public String toString() {
		return "nome:" + nome + " cpf:" + cpf + " email:" + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
