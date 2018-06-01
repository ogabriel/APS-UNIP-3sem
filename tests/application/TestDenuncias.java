package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Denuncias;

class TestDenuncias {

	@Test
	void escolhaIbama() {
		Denuncias d = new Denuncias();
		assertEquals(d.mensagem(1), "Ibama");
	}
	
	@Test
	void escolhaPA() {
		Denuncias d = new Denuncias();
		assertEquals(d.mensagem(2), "Policia ambiental");
	}
	
	@Test
	void escolhaSair() {
		Denuncias d = new Denuncias();
		assertEquals(d.mensagem(3), null);
	}
	
	
}
