package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Problemas;

class TestProblemas {

	@Test
	void test1() {
		Problemas p = new Problemas();
		assertEquals(p.escolha(1), "Solução");
	}
	
	@Test
	void test2() {
		Problemas p = new Problemas();
		assertEquals(p.escolha(2), "Próxima");
	}
	
	@Test
	void test3() {
		Problemas p = new Problemas();
		assertEquals(p.escolha(3), "Denuncia");
	}
	
	@Test
	void test4() {
		Problemas p = new Problemas();
		assertEquals(p.escolha(4), "Sair");
	}
	
}
