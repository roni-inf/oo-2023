package exercicios;

public class Pessoa {
	// Encapuslando atributos
	private String nome;
	private double altura, peso;
	

	/*
	 * atribuir valores ao atributo * this - significa que é do atributo da classe
	 */


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	// Encapsulado - visível somente para esta classe
	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String resultadoIMC() {
		if (calcularIMC() < 18.5) {
			return "Abaixo do peso !";
		} else if (calcularIMC() <= 24.9) {
			return "Peso Normal";
		} else {
			return "Acima do Peso";
		}
	}
}
