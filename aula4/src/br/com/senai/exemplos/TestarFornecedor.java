package br.com.senai.exemplos;

public class TestarFornecedor {

	public static void main(String[] args) {

		Fornecedor fornecedor1 = new Fornecedor("2343434","ABC 123");
		Fornecedor fornecedor2 = new Fornecedor("34343434","XPTO 10");
		Fornecedor fornecedor3 = new Fornecedor("5657757", "WC3");
		
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor2.getNome());
		System.out.println(fornecedor3.getNome());
		System.out.println("Total geral de fornecedores:"+ Fornecedor.getContador());
		
		
	}

}
