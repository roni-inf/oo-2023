package exercicios;

import javax.swing.JOptionPane;

public class TestarFuncionario {

	public static void main(String[] args) {
		int resposta=0;
		do {
			Funcionario funcionario = new Funcionario();

			funcionario.nome = JOptionPane.showInputDialog("Digite o seu nome:");
			funcionario.telefone = JOptionPane.showInputDialog("Digite o seu telefone:");
			funcionario.email = JOptionPane.showInputDialog("Digite o seu email:");
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

			funcionario.aumentarSalario();
			
				JOptionPane.showMessageDialog(null, "salário atualizado:" + funcionario.salario);
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirme", JOptionPane.YES_OPTION);
			} while(resposta==0);

	}

}
