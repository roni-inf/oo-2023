package br.com.senai.exercicios;

import java.time.LocalDate;

public class TestarCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Adriano", 32, "a@gmail.com");
		Cliente c2 = new Cliente("Adriano", 33, "a@gmail.com");
		
		LocalDate data1 = LocalDate.now();
		LocalDate data2 = LocalDate.now();

		data1.equals(data2);
		
		
		String a = "Celular";
		String b = "Celular";

		Integer c = 10;
		Integer d = 10;

		// System.out.println(c1==c2);
		/*
		 * System.out.println(c1.getIdade().equals(c2.getIdade()));
		 * System.out.println(c1.getEmail().equals(c2.getEmail()));
		 * System.out.println(c1.equals(c2));
		 */
		if (a.equals(b)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		

	}

}
