package br.com.senai.exemplos;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String nome, String cpf, double salario, String turno, String categoria) {
		super(nome, cpf, salario, turno);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return super.toString() + "categoria:" + categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void reajusteSalarial() {
		salario = salario + 1000;
	}

}
