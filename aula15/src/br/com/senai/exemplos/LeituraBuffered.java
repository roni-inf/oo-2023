package br.com.senai.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraBuffered {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("\\Aula\\teste.txt");
			BufferedReader bf = new BufferedReader(fr);
			while (bf.ready()) {
				System.out.println(bf.readLine());
			}
			bf.close();
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo!");
		}
	}

}
