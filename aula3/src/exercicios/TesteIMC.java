package exercicios;

public class TesteIMC {

	public static void main(String[] args) {
		
		/*pessoa.nome = "Fulano";
		pessoa.altura = 1.98;
		pessoa.peso = 67;
		*/
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Fulano");
		pessoa.setAltura(1.98);
		pessoa.setPeso(67);
		
		
		System.out.println(pessoa.getNome()+ " Você está:" + pessoa.resultadoIMC());
		
	}

}
