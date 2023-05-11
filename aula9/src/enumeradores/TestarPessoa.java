package enumeradores;

import enumeradores.Pessoa.EstadoCivil;

public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Carlos", "c@gmail.com",Setor.DIRETORIA	, EstadoCivil.DIVORCIADO);
		System.out.println(pessoa);
		System.out.println(pessoa.getSetor().getSala());
		
		Setor[] setores= Setor.values();
		for (int i = 0; i < setores.length; i++) {
			System.out.println(setores[i]);
		}
		
		System.out.println("-------------");
		for (Setor setor : Setor.values()) {
			System.out.println(setor);
		}
	}

}
