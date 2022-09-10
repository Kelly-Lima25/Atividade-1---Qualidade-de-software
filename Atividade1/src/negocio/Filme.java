package negocio;

import java.util.ArrayList;

public class Filme {
	protected String nome;
	protected int id;
	protected double preco;
	protected Genero genero;
	protected ArrayList<Filme> listaFilmes;
	
	public Filme(String nome, Genero genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public double getPreco() {
		return this.preco;
	}
}