package exemplos;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Unimed", "Checkup", "234343443");
		Medico medico = new Medico("Golden Cross", "Joaquim", 2323);
		Anestesista anestesista = new Anestesista("Amil", "José", 2322, "Geral");
		
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPlano(clinica);
		cp.calcularTotalPlano(medico);
		cp.calcularTotalPlano(anestesista);
		
		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
		
		System.out.println("Total Geral pago pelos planos:" + cp);
		
	}

}
