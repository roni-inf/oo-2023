package br.com.senai.exemplos;

import javax.swing.JOptionPane;

public class TestarProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		//int codigo =Integer.parseInt(JOptionPane.showInputDialog("Código do Produto"));
		//String descricao = JOptionPane.showInputDialog("Descrição:");
		//double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto"));
		//double valorReajuste = Double.parseDouble(JOptionPane.showInputDialog("Valor do Reajuste"));
		
		produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Produto")));
		produto.setDescricao(JOptionPane.showInputDialog("Descrição:"));
		produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto")));
		produto.atualizarValor(Double.parseDouble(JOptionPane.showInputDialog("Valor do Reajuste")));
		
		JOptionPane.showMessageDialog(null, produto.getDescricao()+"\n"+ produto.getValor());
		
		
	}

}
