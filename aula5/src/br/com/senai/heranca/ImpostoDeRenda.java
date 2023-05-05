package br.com.senai.heranca;

public abstract class ImpostoDeRenda{
	protected String nome;
	protected String email;
	protected double rendimentos;

	//OVERLOAD
	public ImpostoDeRenda() {
		// TODO Auto-generated constructor stub
	}
	
	public ImpostoDeRenda(String nome, String email, double rendimentos) {
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	}
	
	@Override
	public String toString() {
		return nome + "-" + email +"-" + rendimentos;
	}
	
	//OVERLOAD
	public String imprimirDados() {
		return nome + "-" + email +"-" + rendimentos;
	}

	public String imprimirDados(String texto) {
		return nome + "-" + email +"-" + rendimentos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getRendimentos() {
		return rendimentos;
	}


	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	public abstract double imposto();
	
}
