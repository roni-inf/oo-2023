package enumeradores;

public enum Sanduiche {
	HOTDOG("cachorro quente", 7), HAMBURGUER("hamburguer", 14), MISTO("misto quente", 6);

	private final String tipoSanduiche;
	private final double valor;

	private Sanduiche(String tipoSanduiche, double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public double getValor() {
		return valor;
	}

}
