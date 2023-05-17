package exercicios;

public class TesteDivisao {

	public static void main(String[] args) {
		try {
			System.out.println(Operacao.dividir(10, 0));
			
		} catch (ArithmeticException e) {
			System.out.println("Vc digitou zero no denominador");
		}

	}

}
