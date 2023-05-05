package exercicios;

import java.util.Scanner;

public class TestarVeiculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta = 'S';
		
		do {
		//	Pessoa p1 = new Pessoa();
			//p1.nome = "Roberto";
			Veiculo veiculo  = new Veiculo();
			System.out.println("Digite a placa:");
			veiculo.placa = sc.next();
			
			System.out.println("Digite o tipo de combustível");
			veiculo.tipoCombustivel = sc.next();
			
			System.out.println("Valor do carro:");
			veiculo.valor = sc.nextDouble();
//			veiculo.dono = p1;
			System.out.println("O valor do IPVA é:" + veiculo.calcularIPVA());
			System.out.println("Deseja Continuar (S/s)");
			//System.out.println(veiculo.dono.nome);
			resposta = sc.next().charAt(0);
			//veiculo.totalCarros();
		} while (resposta=='S' || resposta =='s');
	}
}
