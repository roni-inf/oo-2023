package exercicios;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String voar() {
		System.out.println("Voar");
		return null;
	}

	@Override
	public String emitirSom() {
		System.out.println("Emitir som");
		// TODO Auto-generated method stub
		return null;
	}

}
