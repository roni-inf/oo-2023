package br.com.senai.exemplos;

public class TestarFuncionario {

	public static void main(String[] args) {
			Assistente a = new Assistente("Ana", "234", 3000, "Integral", 100);
			Diretor   d = new Diretor("Juliana", "234", 10000, "Integral", "Financeiro");
			
			a.reajusteSalarial();
			d.reajusteSalarial();
			
			System.out.println(a);
			System.out.println(d);
			
	}

}
