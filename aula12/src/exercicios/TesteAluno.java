package exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		double nota1, nota2;
		int confirmacao=0;
		Aluno aluno;
		List<Aluno> alunos = new ArrayList<>();

		do {
			try {
				nome = JOptionPane.showInputDialog("Nome:");
				nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota1:"));
				nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota2:"));
				aluno = new Aluno(nome, nota1, nota2);
				alunos.add(aluno);
				confirmacao = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Continuar",0);

			} catch (AlunoException e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Você digitou um caracter inválido");
			}
		} while (confirmacao == 0);

	}

}
