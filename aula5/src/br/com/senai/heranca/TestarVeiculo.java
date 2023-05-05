package br.com.senai.heranca;

public class TestarVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("ABC-0909", "2343", "Azul", 50000, 9000);
		VeiculoPasseio vp = new VeiculoPasseio("ZER-2342", "234", "Branco", 22500, "Sedan");
		Moto m = new Moto("XPT-9090","3434", "Preta",5000, 125);
		
		Veiculo v1 = new Moto("XXT-9090","3434", "Azul",6000, 125);
		Veiculo v2 = new VeiculoPasseio("ZAR-2342", "234", "Branco", 20500, "Sedan");
		
		System.out.println("Dados caminhão:"+ c.getPlaca() + " " + c.getValor());
		System.out.println("O valor do IPVA é:" + c.valorIPVA());
		
		System.out.println("Dados veículo passeio:"+ vp.getPlaca() + " " + vp.getValor());
		System.out.println("O valor do IPVA é:" + vp.valorIPVA());
		
		System.out.println("Dados da moto:"+ m.getPlaca() + " " + m.getValor());
		System.out.println("O valor do IPVA é:" + m.valorIPVA());

	}

}
