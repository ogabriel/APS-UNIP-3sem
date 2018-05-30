package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Denuncias;

class TestDenuncias {

	@Test
	void opcaoIbama() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(1), "Ibama");
	}
	
	@Test
	void opcaoPA() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(2), "Policia ambiental");
	}
	
	@Test
	void opcaoSair() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(3), "Sair");
	}

}
