package br.com.senai.exemplos;

public class Cliente {
	private String nome;
	private static int contador;
	private String email;
	private double salario;

	

	public Cliente(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome:"+nome;
	}
	
	public static int getContador() {
		return contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void aumentarSalario() {
		salario =  salario * 1.10;
	}

}
