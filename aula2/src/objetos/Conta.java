package objetos;

public class Conta {
	int numero;
	String titular;
	double saldo;

	// Comportamentos
//o método não terá retorno
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

	// método vai ter retorno do tipo boolean
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
}
