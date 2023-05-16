package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraException {

	public static void main(String[] args) {
		try {
			String[] vetor = { "Celular", "TV", "Kindle" };
			FileReader fr = new FileReader("c:\\Aula\\exto.txt");
			System.out.println("Arquivo encontrado");
			System.out.println(vetor[4]);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado !");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("índice fora de faixa !");
			e.printStackTrace();
		} finally {
			System.out.println("Fim de programa !");
		}
	}

}
