package br.com.senai.revisao;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
	private Boolean possuiAlergia;
	private List<Consulta> consultas = new ArrayList<>();

	public Paciente(String nome, String cpf, String email, Boolean possuiAlergia) {
		super(nome, cpf, email);
		this.possuiAlergia = possuiAlergia;
	}

	@Override
	public String toString() {
		return super.toString() + " " + (possuiAlergia == true ? "Sim" : "Não");
	}

	public Boolean getPossuiAlergia() {
		return possuiAlergia;
	}

	public void setPossuiAlergia(Boolean possuiAlergia) {
		this.possuiAlergia = possuiAlergia;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void adicionarConsultas(Consulta consulta) {
		consultas.add(consulta);
	}

}
