package br.com.senai.revisao;

import java.util.List;

public interface Diagnostico {
	public List<String> realizarExame(String nome);
	public List<String> receituario(List<String>remedios);
	
}
