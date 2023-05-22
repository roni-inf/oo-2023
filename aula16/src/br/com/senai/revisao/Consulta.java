package br.com.senai.revisao;

import java.time.LocalDate;
import java.util.List;

public class Consulta implements Diagnostico {
	private LocalDate dataConsulta;
	private Medico medico;
	private Paciente paciente;

	public Consulta(LocalDate dataConsulta, Medico medico, Paciente paciente) {
		super();
		this.dataConsulta = dataConsulta;
		this.medico = medico;
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "dataConsulta=" + dataConsulta + ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public List<String> realizarExame(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> receituario(List<String> remedios) {
		// TODO Auto-generated method stub
		return null;
	}

}
