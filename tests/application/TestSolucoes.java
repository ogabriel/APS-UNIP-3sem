package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolucoes {
	
	@Test
	void mensagem1() {
		Solucoes s = new Solucoes();
		s.setOpcao(1);		
		assertEquals(s.mensagem(), "mensagem1");
	}
	
	@Test
	void mensagem2() {
		Solucoes s = new Solucoes();
		s.setOpcao(2);		
		assertEquals(s.mensagem(), "mensagem2");
	}
	
	@Test
	void mensagem3() {
		Solucoes s = new Solucoes();
		s.setOpcao(1);		
		assertEquals(s.mensagem(), "mensagem1");
	}
}
