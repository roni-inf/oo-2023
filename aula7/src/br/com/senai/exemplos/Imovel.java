package br.com.senai.exemplos;

public class Imovel {
	protected String local;
	protected double valor;

	public Imovel(String local, double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Local:" + local + " valor:" + valor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcularImpostoTransmissao() {
		return valor * 0.035;
	}
}
