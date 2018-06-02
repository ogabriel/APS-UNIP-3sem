package menu;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Problemas;

class TestProblemas {
	
	@Test
	void mensagem1() {
		Problemas p = new Problemas();
		p.setOpcao(1);
		assertEquals(p.mensagem(), "mensagem1");
	}
	
	@Test
	void mensagem2() {
		Problemas p = new Problemas();
		p.setOpcao(2);
		assertEquals(p.mensagem(), "mensagem2");
	}
	
	@Test
	void mensagem3() {
		Problemas p = new Problemas();
		p.setOpcao(3);
		assertEquals(p.mensagem(), "mensagem3");
	}
}
