package menu;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Denuncias;

class TestDenuncias {

	@Test
	void mensagemIbama() {
		Denuncias d = new Denuncias();
		d.setOpcao(1);
		assertEquals(d.mensagem(), "\nDenúncia Ibama\n"
				+ "Para efetuar uma denuncia pelo Ibama(Instituto Brasileiro do Meio Ambiente e dos Recursos\n"
				+ "Naturais Renováveis) que é o principal orgão do governo federal para fiscalização e controle\n"
				+ "do meio ambiente. É necessário primeiro ligar para a Linha Verde, o serviço de ouvidoria pelo\n"
				+ "telefone: 0800 61 8080 ou pelo e-mail: linhaverde.sede@ibama.gov.br\n"
				+ "A ligação é gratuita de qualquer parte do país, de segunda a sexta das 8h às 18h\n"
				+ "Em até 30 dias após a denúncia, a unidade responsável devera se manifestar\n");
	}
	
	@Test
	void mensagemPA() {
		Denuncias d = new Denuncias();
		d.setOpcao(2);
		assertEquals(d.mensagem(), "\nDenúncia Policia Militar Ambiental\n"
				+ "No Estado de São Paulo, as denúncias relacionadas aos crimes e infrações ambientais são registradas\n"
				+ "e controladas por um sistema que integra as Secretarias do Meio Ambiente e da Segurança Pública (Polícia\n"
				+ "Militar Ambiental), possibilitando agilidade de comunicação e resposta e o acompanhamento das medidas\n"
				+ "adotadas.\n"
				+ "As denuncias podem ser feitas por meio dos aplicativo de celular:\n"
				+ "Tanto pela Google Play quanto pela App Store, deve se pesquisar por: Denúncias Ambiente\n"
				+ "As denúncias também podem ser feitas pelo tefelfone da polícia militar: 190\n"
				+ "E por último, denunciar para as unidades de policiamento ambiental (apenas São Paulo Capital):\n"
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
