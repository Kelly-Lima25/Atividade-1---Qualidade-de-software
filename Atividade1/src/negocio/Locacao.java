package negocio;

import java.time.format.DateTimeFormatter;

public class Locacao {
	protected Cliente cliente;
	protected Filme filme;
	protected double valorAluguel;
	protected DateTimeFormatter data;
	protected DateTimeFormatter hora;
	
	public void alugar(Cliente c, Filme f) {
		this.cliente = c;
		this.filme = f;
		this.data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.hora = DateTimeFormatter.ofPattern("HH:mm:ss");
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel=valorAluguel;
	}
	
	
}

