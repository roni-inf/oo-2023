package br.com.senai.exemplos;

public class AuxiliarProducao extends Auxiliar {
	private int numeroMaquina;

	public AuxiliarProducao(String nome, String cpf, double salario, String turno, String categoria, int numeroMaquina) {
		super(nome, cpf, salario, turno, categoria);
		this.numeroMaquina = numeroMaquina;
	}

	@Override
	public void reajusteSalarial() {
		// TODO Auto-generated method stub
		
	}

}
