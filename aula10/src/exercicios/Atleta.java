package exercicios;

public class Atleta {
	private String nome;
	private int idade;
	private String posicao;

	public Atleta(String nome, int idade, String posicao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", posicao=" + posicao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

}
