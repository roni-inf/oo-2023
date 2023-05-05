package testes;

import objetos.Produto;

public class TestarProduto {

	public static void main(String[] args) {
	Produto p1 = new Produto();
	Produto p2 = new Produto();
	
		if (p1==p2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		System.out.println(p1==p2?"Igual":"Diferente");
		
	}

}
