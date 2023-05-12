package exemplos;

public class TestarFuncionario {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];
		
		//Criar três instâncias de funcionários
		funcionarios[0] = new Funcionario("Roni", 4000);
		funcionarios[1] = new Funcionario("Adriana", 3000);
		funcionarios[2] = new Funcionario("João", 4400);
		
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i].aumentarSalario(200);
			System.out.println(funcionarios[i]);
		}
	}

}
