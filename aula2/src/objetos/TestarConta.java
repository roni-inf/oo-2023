package objetos;

public class TestarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Roni";
		conta1.saldo = 1000;
		conta1.depositar(100);
		
		if (conta1.sacar(200)) {
			System.out.println("Saque efetuado!");
		} else {
			System.out.println("Saldo insuficiente! ");
		}
		
		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Joaquim";
		conta2.saldo = 2000;
		conta2.depositar(200);
		System.out.println(conta2.sacar(500)?"Saque Efetuado":"Saldo insuficinete");
		
		System.out.println("Nº conta:" + conta1.numero);
		System.out.println("Titular" + conta1.titular);
		System.out.println("Saldo:" + conta1.saldo);
		System.out.println("----------------");
		System.out.println("Nº conta:" + conta2.numero);
		System.out.println("Titular" + conta2.titular);
		System.out.println("Saldo:" + conta2.saldo);

	}

}
