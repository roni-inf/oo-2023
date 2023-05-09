package br.com.senai.exemplos;

public class Assistente extends Funcionario{
	private double adicional;

	public Assistente(String nome, String cpf, double salario, String turno, double adicional) {
		super(nome, cpf, salario, turno);
		this.adicional = adicional;
	}

	
	@Override
	public String toString() {
		return super.toString() + "adicional:" + adicional;
	}

	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}


	@Override
	public void reajusteSalarial() {
		salario = salario * 1.10;
		
	}

}
