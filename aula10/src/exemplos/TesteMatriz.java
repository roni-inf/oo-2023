package exemplos;

public class TesteMatriz {

	public static void main(String[] args) {
		//String[][]clientes = new String[3][2];
		String[][] clientes = {{"Marcos","2234-1909"},
							  {"Carla","2232-1209"},
							  {"Carlos","2231-1109"}};
		
		
		for (int linha = 0; linha < clientes.length; linha ++) {
			System.out.println("---------------");
			for (int coluna = 0; coluna < clientes[linha].length; coluna++) {
				System.out.println(clientes[linha][coluna]);
			}
		}
	}

}
