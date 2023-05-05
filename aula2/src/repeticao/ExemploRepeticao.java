package repeticao;

public class ExemploRepeticao {

	public static void main(String[] args) {
		System.out.println("--------- WHILE -----------");
		int cont = 1;
		while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		
		System.out.println("-------- DO WHILE -----------");
		
		cont = 1;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 10);
		
		System.out.println("--------- FOR -------------");
		
		for (int i = 1; i <=10; i++) {
			if (i>=5 && i<=6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
