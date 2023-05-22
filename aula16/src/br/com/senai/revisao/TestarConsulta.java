package br.com.senai.revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class TestarConsulta {

	public static void main(String[] args) {
		Medico medico1 = new Medico("José", "123", "j@gmail.com", "123", 250., Especialidade.CARDIOLOGIA);
		Medico medico2 = new Medico("Patricia", "343", "p@gmail.com", "343", 200., Especialidade.ORTOPEDIA);
		int resposta = 0, escolha = 0;
		do {
			String nome = JOptionPane.showInputDialog("Informe o nome do paciente:");
			String cpf = JOptionPane.showInputDialog("Informe o cpf do paciente:");
			String email = JOptionPane.showInputDialog("Informe o email do paciente:");
			int alergia = JOptionPane.showConfirmDialog(null, "Tem alergia?", "alérgico", JOptionPane.YES_OPTION);

			Paciente paciente = new Paciente(nome, cpf, email, (alergia == 0 ? true : false));

			JOptionPane.showMessageDialog(null, "***ESCOLHA O MÉDICO:\n1." + medico1.getNome() + "\n2." + medico2.getNome());
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o médico desejado:"));
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataConsulta = LocalDate.parse(JOptionPane.showInputDialog("Digite uma data: "), formato);
			
			Consulta consulta = new Consulta(dataConsulta, (escolha == 1 ? medico1 : medico2), paciente);

			if (escolha == 1) {
				medico1.adicionarConsultas(consulta);
			} else {
				medico2.adicionarConsultas(consulta);
			}
			paciente.adicionarConsultas(consulta);
			resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma nova consulta?", "consulta nova",
					JOptionPane.YES_OPTION);
		} while (resposta == 0);

		for (Consulta consulta : medico1.getConsultas()) {
			System.out.println(consulta);
		}
		System.out.println("----------------------------");
		for (Consulta consulta : medico2.getConsultas()) {
			System.out.println(consulta);
		}

	}

}
