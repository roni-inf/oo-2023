package exercicios;

import java.util.Scanner;

public class TestarTime {

	public static void main(String[] args) {
		Time time = new Time("Flamengo", "Sampaoli");

		Scanner sc = new Scanner(System.in);
		Atleta atleta;
		String nome, posicao; 
		int idade;
		
		char resp = 'S';
		do {
			System.out.println("Nome:");
			nome = sc.nextLine();
			System.out.println("Idade:");
			idade = sc.nextInt();
			System.out.println("Posição:");
			posicao = sc.next();
			atleta = new Atleta(nome, idade, posicao);
			time.adicionarAtleta(atleta);
			System.out.println("Digite (S/s) para continuar?");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp == 's');
			System.out.println(time.getNome());
			System.out.println("*******************");
			time.imprimirAtletas();
	}

}
