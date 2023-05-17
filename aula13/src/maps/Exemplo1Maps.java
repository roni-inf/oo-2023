package maps;

import java.util.HashMap;
import java.util.Map;

import exercicios.Produto;

public class Exemplo1Maps {

	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		estados.put("AC", "ACRE");
		estados.put("MG", "MINAS GERAIS");
		estados.put("SP", "SÃO PAULO");
		estados.put("RJ", "RIO DE JANEIRO");
		// System.out.println(estados.keySet());
		System.out.println("---imprimir chave---");
		for (String chave : estados.keySet()) {
			System.out.println(chave);
		}
		System.out.println("--imprimir valores---");
		for (String valores : estados.values()) {
			System.out.println(valores);
		}
		System.out.println("--imprimir chave e valores--");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa.getKey() + "-" + mapa.getValue());
		}

		Map<Integer,Produto> produtos = new HashMap<>();
		produtos.put(1, new Produto("Celular",2000));
		produtos.put(2, new Produto("Radio",90));
		
		System.out.println(produtos.values());
		
		
	}

}
