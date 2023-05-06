package relacionamentos;

public class TestarImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("233", "Ana", "ana@gmail.com");
		Pessoa p2 = new Pessoa("232", "Antônio", "antonio@gmail.com");
		
		Imovel imovel = new Imovel("Apto", "Centro", 289000, p2);
		
		System.out.println(imovel.getTipo() + "-"+ imovel.getValor()+ "-"
				+imovel.getPessoa().getNome());
		
	}

}
