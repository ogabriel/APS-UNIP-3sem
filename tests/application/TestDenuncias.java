package application;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDenuncias {

	@Test
	void mensagemIbama() {
		Denuncias d = new Denuncias();
		d.setOpcao(1);
		assertEquals(d.mensagem(), "mensagem Ibama");
	}
	
	@Test
	void mensagemPA() {
		Denuncias d = new Denuncias();
		d.setOpcao(2);
		assertEquals(d.mensagem(), "mensagem PA");
	}
	
	@Test
	void mensagemSair() {
		Denuncias d = new Denuncias();
		d.setOpcao(3);
		assertEquals(d.mensagem(), null);
	}
	
	@Test
	void escolhaIbama() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(1), false);
	}
	
	@Test
	void escolhaPA() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(2), false);
	}
	
	@Test
	void escolhaSair() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(3), true);
	}
	
	@Test
	void escolhaErrado() {
		Denuncias d = new Denuncias();
		assertEquals(d.escolha(4), false);
		assertEquals(d.escolha(5), false);
		assertEquals(d.escolha(6), false);	
	}
	
	
}
