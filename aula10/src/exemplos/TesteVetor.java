package exemplos;

public class TesteVetor {

	public static void main(String[] args) {
		String[] eletronicos = {"Celular","Tv","Relógio"};
		//eletronicos[0]= "Celular";
	//	System.out.println(eletronicos[0]);
		
		/*for (int i = 0; i < eletronicos.length; i++) {
			System.out.println(eletronicos[i]);
		}
		*/
		
		for (String e : eletronicos) {
			System.out.println(e);
		}
		
		
	}

}
