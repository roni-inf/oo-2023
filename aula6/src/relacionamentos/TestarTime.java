package relacionamentos;

public class TestarTime {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Neymar", "Atacante", 30);
		Atleta atleta2 = new Atleta("Messi", "Atacante", 35);
		Atleta atleta3 = new Atleta("Mbappe", "Atacante", 22);
		
		Time time = new Time("PSG", "Guardiola", new Atleta[3]);
		
		time.adicionarAtletas(atleta1);
		time.adicionarAtletas(atleta2);
		time.adicionarAtletas(atleta3);
		
		time.listarAtletas();

	}

}
