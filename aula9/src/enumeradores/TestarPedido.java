package enumeradores;

import java.time.LocalDate;

public class TestarPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);
		pedido.imprimirCardapio();
		System.out.println("\n-------------------");
		System.out.println(pedido);
		System.out.println("---------------------");
		System.out.println("Total do pedido:"+ pedido.calcularPedido());
		System.out.println("---------------------");
	}

}
