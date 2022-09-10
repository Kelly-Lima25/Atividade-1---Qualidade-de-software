package negocio;

import negocio.Cliente;
import negocio.Locacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilmeTest {
	Cliente c1;
	Filme f1;
	Locacao loc;
	Transacao t1;
	
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cliente("Nájala", 1);
		f1 = new Filme("Titanic", Genero.DRAMA);
		loc = new Locacao();
		t1 = new Transacao();
		loc.alugar(c1, f1);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		t1.alugueis.add(loc);
		assertTrue(t1.alugueis.get(0).cliente.nome == "Nájala");
	}

}