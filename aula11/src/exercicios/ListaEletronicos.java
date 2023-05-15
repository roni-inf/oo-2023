package exercicios;

import java.util.Set;
import java.util.TreeSet;

public class ListaEletronicos {

	public static void main(String[] args) {
		//List<String> eletronicos = new ArrayList<>();
		Set<String> eletronicos = new TreeSet<>();
		eletronicos.add("Celular");
		eletronicos.add("TV 42");
		eletronicos.add("Radio");
		eletronicos.add("Radio");
		eletronicos.add("Relógio");
		
		for (String s : eletronicos) {
			System.out.println(s);
		}

		System.out.println(eletronicos.contains("Celular")?"Existe":"Não existe");
	}

}
