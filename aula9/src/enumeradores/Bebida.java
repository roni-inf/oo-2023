package enumeradores;

public enum Bebida {
	REFRIGERANTE("refrigerante", 6.2), SUCO("suco de laranja", 7), AGUA("agua mineral", 2);

	private final String tipoBebida;
	private final double valor;

	private Bebida(String tipoBebida, double valor) {
		this.tipoBebida = tipoBebida;
		this.valor = valor;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public double getValor() {
		return valor;
	}

}
