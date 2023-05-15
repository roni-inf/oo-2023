package exercicios;

public final class Direito extends Faculdade implements Oab, Eventos{
	private int tempoDuracao;

	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

	@Override
	public String programacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		Universidade d = new Direito(null, null, 0, 0);
		Eventos
		e = new Direito(null, null, 0, 0);
		
	}
}
