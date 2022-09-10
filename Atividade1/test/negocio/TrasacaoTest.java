package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrasacaoTest {
	Cliente c1, c2, c3;
	Filme f1, f2, f3;
	Locacao loc1, loc2, loc3;
	Transacao t;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cliente("Jesga", 1);
		f1 = new Filme("One Day", Genero.ROMANCE);
		
		c2 = new Cliente("Ellen", 2);
		f2 = new Filme("A ilha do medo", Genero.SUSPENSE);
		
		c3 = new Cliente("Nájala", 3);
		f3 = new Filme("Carol", Genero.ROMANCE);
		
		loc1 = new Locacao();
		loc2 = new Locacao();
		loc3 = new Locacao();
		
		t = new Transacao();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void retornaOGeneroMaisAlugado() {
		loc1.alugar(c1, f1);
		loc2.alugar(c2, f2);
		loc3.alugar(c3, f3);
		
		t.alugueis.add(loc1);
		t.alugueis.add(loc2);
		t.alugueis.add(loc3);
		
		assertTrue(t.genMaisAlugado() == Genero.ROMANCE);
		
	}

	@Test
	public void deveAddDescontoNoFilme() {
		loc1.alugar(c1, f1);
		loc1.filme.preco = 125.0;

		t.descontoFilme(Genero.ROMANCE, 15.0);
		
		t.alugueis.add(loc1);
		assertTrue(loc1.filme.preco == 106.25);
	}
}