package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Solucoes;

class TestSolucoes {

	@Test
	void test1() {
		Solucoes s = new Solucoes();
		assertEquals(s.escolha(1), "Denunciar");
	}
	
	@Test
	void test2() {
		Solucoes s = new Solucoes();
		assertEquals(s.escolha(1), "Sair");
	}

}
