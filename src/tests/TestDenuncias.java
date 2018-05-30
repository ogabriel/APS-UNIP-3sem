package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Denuncias;

class TestDenuncias {

	@Test
	void test1() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(1), "Ibama");
	}
	
	@Test
	void test2() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(2), "Policia ambiental");
	}
	
	@Test
	void test3() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(3), "Sair");
	}

}
