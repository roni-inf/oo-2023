package br.com.senai.conexao;

import java.util.Scanner;

import br.com.senai.dao.ProdutoDao;
import br.com.senai.entity.Produto;

public class TestarCrud {

	public static void main(String[] args) {
		/*
		 * INSERIR ProdutoDao dao = new ProdutoDao();
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Nome:"); String nome
		 * = sc.nextLine(); System.out.println("Descrição:"); String descricao =
		 * sc.nextLine(); System.out.println("Preço:"); Double preco = sc.nextDouble();
		 * System.out.println("Qtde Estoque:"); Integer qtdeEstoque = sc.nextInt();
		 * Produto produto = new Produto(null, nome, descricao, preco, qtdeEstoque);
		 * dao.inserir(produto);
		 */

		/* Listar */
		ProdutoDao dao = new ProdutoDao();
		for (Produto p : dao.listarPorNome("T",1)) {
			System.out.println(p);
		}
	}

}
