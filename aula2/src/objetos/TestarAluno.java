package objetos;

public class TestarAluno {
	public static void main(String[] args) {
		// Criar um objeto em memória - Instância
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		Aluno c = new Aluno();
		//Cada new é criado um novo objeto do tipo Aluno em memória
		
		new Aluno();
		
		
		
		a.nome = "Adriano";
		a.email = "adriano@gmail.com";

		b.nome = "Antônio";
		b.email = "antonio@hotmail.com";

		c.nome = "Carla";
		c.email = "carla@gmail.com";

		System.out.println(a.nome);
		System.out.println(b.nome);
		System.out.println(c.nome);
		System.out.println(new Aluno());
		System.out.println(new Aluno());
		System.out.println(c);
		System.out.println(a);
	}

}
