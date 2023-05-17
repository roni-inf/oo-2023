package maps;

import java.util.HashMap;
import java.util.Map;

public class ConverterMatrizMaps {

	public static void main(String[] args) {
		String[][] carros = {{ "FIAT", "ARGO" },
							{ "RENAULT", "SANDERO" },
							{ "VW", "T-CROSS" },
							{ "HYUNDAI", "HB20" } };
		Map<String, String> mapasCarros = new HashMap<String, String>();

		for (int linha = 0; linha < carros.length; linha++) {
			for (int coluna = 0; coluna < carros[linha].length; coluna++) {
				if (coluna == 0) {
					mapasCarros.put(carros[linha][coluna], carros[linha][coluna+1]);
					break;
				}
			}
		}
		System.out.println(mapasCarros);
	}

}
