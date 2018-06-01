package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.*;

class TestProblemas {
	
	@Test
	void mensagem1() {
		Problemas p = new Problemas();
		assertEquals(p.mensagem(1), "mensagem1");
	}
	
	@Test
	void mensagem2() {
		Problemas p = new Problemas();
		assertEquals(p.mensagem(2), "mensagem2");
	}
	
	@Test
	void mensagem3() {
		Problemas p = new Problemas();
		assertEquals(p.mensagem(3), "mensagem3");
	}
}
