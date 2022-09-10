package negocio;

import java.util.ArrayList;

public class Transacao {

	protected  ArrayList<Locacao> alugueis;
	
	public Transacao() {
		
		alugueis= new ArrayList<Locacao>();
	}
	
	
	
	
	public Cliente buscaCliente(int id) {
		for (Locacao locacao : alugueis) {
			if(locacao.cliente.id==id) {
				return locacao.cliente;
			}
			
		}
		return null;
	}
	
	
	//Questão 3
	public Genero genMaisAlugado() {
		int contGen = 0;
		int totalGen = 0;
		Genero gen = null;
		for(Genero genero : Genero.values()) {
			for(Locacao loc : alugueis) {
				if(loc.filme.genero == genero) {
					contGen++;
				}
			}
			if(contGen > totalGen) {
				totalGen = contGen;
				gen = genero;
			}
			contGen = 0;
		}
		
		return gen;
	}
	//Questão 4
	public void descontoFilme(Genero genero, double desconto) {
		double taxa = 0;
		for (Locacao locacao : alugueis) {
			if(locacao.filme.genero==genero) {
				taxa = locacao.valorAluguel*(desconto/100);
				locacao.valorAluguel= locacao.valorAluguel - taxa;
				
			}
		}
	}
	
}