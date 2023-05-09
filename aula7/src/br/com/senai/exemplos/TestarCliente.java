package br.com.senai.exemplos;

public class TestarCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Carlos",1000);
		Cliente cliente2 = new Cliente("Carla",2000);
		Cliente cliente3 = new Cliente("Catarina",3000);

		cliente1.aumentarSalario();
		System.out.println();
		System.out.println("Total geral de clientes:"+Cliente.getContador());
		
		System.out.println(cliente1);
	}

}
