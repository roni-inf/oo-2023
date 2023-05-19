package br.com.senai.exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploBufferedWriter {

	public static void main(String[] args) {
		String[] disciplinas = { "Java", "React", "Angular", "PHP", "Delphi" };
		String caminho = "c:\\Aula\\disciplinasnovas.txt";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true));
			for (String d : disciplinas) {
				bw.write(d);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.err.println("Arquivo não foi criado !");
			e.printStackTrace();
		}
	}

}
