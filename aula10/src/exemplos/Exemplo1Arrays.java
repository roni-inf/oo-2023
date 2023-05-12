package exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo1Arrays {

	public static void main(String[] args) {
		
		 // Arrays - 
		 List disciplinas = Arrays.asList("Inglês","Português");
		 
		 //disciplinas.add("História");
		 disciplinas.set(0, "Geografia");
		 
		 System.out.println(disciplinas);
		 
		 List cores = List.of("Amarelo","Branco","Vermelho","Azul");
		 //cores.set(0,"Preto");

	}

}
