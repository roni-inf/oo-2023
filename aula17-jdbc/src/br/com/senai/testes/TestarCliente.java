package br.com.senai.testes;

import java.util.Scanner;

import br.com.senai.dao.ClienteDao;
import br.com.senai.entity.Cliente;

public class TestarCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Nome:"); String nome = sc.nextLine();
		 * System.out.println("Telefone:"); String telefone = sc.nextLine();
		 * System.out.println("Email:"); String email = sc.nextLine();
		 * 
		 * System.out.println("Código"); Integer codigo = sc.nextInt();
		 * 
		 * 
		 * Cliente cliente = new Cliente(codigo, nome, telefone, email); ClienteDao dao
		 * = new ClienteDao();
		 * 
		 * //dao.inserirRegistro(cliente); dao.atualizarRegistro(cliente);
		 * System.out.println("Atualização efetuada !");
		 * 
		 */

		// Remover
		/*
		 * System.out.println("Digite o código para remover um cliente:"); int codigo =
		 * sc.nextInt(); ClienteDao dao = new ClienteDao(); dao.remover(codigo);
		 * System.out.println("Cliente removido !");
		 */

		// Listar todos os clientes
		ClienteDao dao = new ClienteDao();
		// System.out.println(dao.listarClientes());
		for (Cliente c : dao.listarClientes()) {
			System.out.println(c);
		}

	}

}
