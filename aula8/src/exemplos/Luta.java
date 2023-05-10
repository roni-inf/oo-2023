package exemplos;

import java.time.LocalDate;

public class Luta implements Desafio {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private LocalDate dataLuta;
	private boolean confirmado;

	public Luta(Lutador desafiante, Lutador desafiado, int rounds, LocalDate dataLuta) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.dataLuta = dataLuta;
	}

	@Override
	public String toString() {
		return "Desafiante:" + desafiante + "Desafiado:" + desafiado + (confirmado ? "Luta confirmada" : "Luta não confirmada");
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public LocalDate getDataLuta() {
		return dataLuta;
	}

	public void setDataLuta(LocalDate dataLuta) {
		this.dataLuta = dataLuta;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	@Override
	public boolean confirmacaoLuta() {

		if (!desafiante.equals(desafiado) 
			&& desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		}
		return false;
	}

	@Override
	public String ranking() {
		
		return "implementar";
	}

}
