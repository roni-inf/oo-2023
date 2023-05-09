package br.com.senai.exemplos;

public class AssistenteAdministrativo extends Assistente {
	private String sala;

	public AssistenteAdministrativo(String nome, String cpf, double salario, String turno, double adicional, String sala) {
		super(nome, cpf, salario, turno, adicional);
		this.sala = sala;
	}

}
