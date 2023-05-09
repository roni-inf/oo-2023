package br.com.senai.interfaces;

//Toda interface não tem implementação somente assinaturas
//que deverão implementadas por quem implementar essa interface
//Uma interface não pode ser instanciada
public interface Conta {
	//public final static String nomeBanco="Bradesco";
	public abstract void sacar(double valor);
	public abstract void deposito(double valor);
}
