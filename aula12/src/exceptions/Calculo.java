package exceptions;

public class Calculo {
	
	//throws Encaminhar o erro para frente
	public static int divisão(int num1, int num2)  {
		/* exemplo com throw 
		if (num2 == 0) {
			throw new ArithmeticException("Erro ! Você dividiu um nº por zero");
		}
		System.out.println("teste");
	*/	
		return num1/num2;
	}
}
