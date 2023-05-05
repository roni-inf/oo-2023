package exercicios;

public class Veiculo {
	String placa;
	String tipoCombustivel;
	double valor;
//	Pessoa dono;

	// Criar um método para verificar o tipo de combustível
	// Caso seja Flex ou Gasolina o retorno do cálculo do IPVA será de 4% do valor
	// do carro
	// Caso seja Gás o valor de retorno será sobre 1,5% do valor do carro

	public double calcularIPVA() {
		if (tipoCombustivel.equals("Flex") || tipoCombustivel.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}
	
	
	

}
