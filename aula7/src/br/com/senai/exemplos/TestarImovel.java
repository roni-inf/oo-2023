package br.com.senai.exemplos;

public class TestarImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel("Centro", 289000);
		Imovel imovel2 = new Imovel("Bingen", 310000);
		
		Proprietario p1 = new Proprietario("Juliana", imovel1);
		Proprietario p2 = new Proprietario("Alex", imovel2);
		
		//Nome do proprietário
		System.out.println(p1.getNome());
		//Dados do imóvel que esse proprietário comprou
		System.out.println(p1.getImovel());
		//Imposto que o  proprietário vai pagar 
		System.out.printf("%.2f",p1.getImovel().calcularImpostoTransmissao());
		/*int idade = 20;
		String  nome = "Ana";
		
		System.out.printf("\n%s tem %d anos",nome,idade);
		*/
	}

}
