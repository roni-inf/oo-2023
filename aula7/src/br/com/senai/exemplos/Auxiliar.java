package br.com.senai.exemplos;

public abstract class Auxiliar extends Funcionario {
	private String categoria;

	public Auxiliar(String nome, String cpf, double salario, String turno, String categoria) {
		super(nome, cpf, salario, turno);
		this.categoria = categoria;
	}

}
