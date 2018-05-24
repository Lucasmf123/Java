package controladores;

import java.util.ArrayList;

public class Lanches {

	// Atributos
	private String nomeProduto;
	private double valorProduto;

	// ArrayList
	public static ArrayList<Lanches> dados = new ArrayList<>();

	// Métodos
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

}
