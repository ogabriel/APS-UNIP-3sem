package menu;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Denuncias;

class TestDenuncias {

	@Test
	void mensagemIbama() {
		Denuncias d = new Denuncias();
		d.setOpcao(1);
		assertEquals(d.mensagem(), "\nDen�ncia Ibama\n"
				+ "Para efetuar uma denuncia pelo Ibama(Instituto Brasileiro do Meio Ambiente e dos Recursos\n"
				+ "Naturais Renov�veis) que � o principal org�o do governo federal para fiscaliza��o e controle\n"
				+ "do meio ambiente. � necess�rio primeiro ligar para a Linha Verde, o servi�o de ouvidoria pelo\n"
				+ "telefone: 0800 61 8080 ou pelo e-mail: linhaverde.sede@ibama.gov.br\n"
				+ "A liga��o � gratuita de qualquer parte do pa�s, de segunda a sexta das 8h �s 18h\n"
				+ "Em at� 30 dias ap�s a den�ncia, a unidade respons�vel devera se manifestar\n");
	}
	
	@Test
	void mensagemPA() {
		Denuncias d = new Denuncias();
		d.setOpcao(2);
		assertEquals(d.mensagem(), "\nDen�ncia Policia Militar Ambiental\n"
				+ "No Estado de S�o Paulo, as den�ncias relacionadas aos crimes e infra��es ambientais s�o registradas\n"
				+ "e controladas por um sistema que integra as Secretarias do Meio Ambiente e da Seguran�a P�blica (Pol�cia\n"
				+ "Militar Ambiental), possibilitando agilidade de comunica��o e resposta e o acompanhamento das medidas\n"
				+ "adotadas.\n"
				+ "As denuncias podem ser feitas por meio dos aplicativo de celular:\n"
				+ "Tanto pela Google Play quanto pela App Store, deve se pesquisar por: Den�ncias Ambiente\n"
				+ "As den�ncias tamb�m podem ser feitas pelo tefelfone da pol�cia militar: 190\n"
				+ "E por �ltimo, denunciar para as unidades de policiamento ambiental (apenas S�o Paulo Capital):\n"
				+ "Zona Leste: 11 2791-0079 e 1bpamb5cia1pel@policiamilitar.sp.gov.br\n"
				+ "Zona Norte: 11 2990-1120 e 1bpamb1cia1pel@policiamilitar.sp.gov.br\n"
				+ "Zona Oeste e Sul: 11 3225-1085 e 1bpamb2cia1pel@policiamilitar.sp.gov.br\n");
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
