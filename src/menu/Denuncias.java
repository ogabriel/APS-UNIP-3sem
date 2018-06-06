package menu;

import application.Tools;

public class Denuncias extends Menu implements Mensagens{

	
	@Override
	public void continueMenu() {
		boolean exit = false;
		Tools.show("\nAs vezes por falta de op��o � necess�rio intervir de outras formas para acabar\n"
				+ "com certos problemas ambientais. Os dois meios mais efici�ntes de denuncias no\n"
				+ "nosso pa�ss atualmente s�o o Ibama e a Pol�cia Ambiental\n");
		while(!exit) {		
			Tools.show("Op��es dispon�veis:");
			Tools.menu("Ibama", "Pol�cia Ambiental", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);
		}	
	}
	
	@Override
	public boolean escolha(int resposta) {		
		switch(resposta) {
			case 1:
				this.setOpcao(1);
				Tools.show(mensagem());
				return false;
			case 2:
				this.setOpcao(2);
				Tools.show(mensagem());
				return false;
			case 3:
				return true;
			default:
				Tools.show("Op��o invalida");
				return false;
		}
	}

	@Override
	public String mensagem() {
		switch (getOpcao()) {
		case 1:
			return "\nDen�ncia Ibama\n"
					+ "Para efetuar uma denuncia pelo Ibama(Instituto Brasileiro do Meio Ambiente e dos Recursos\n"
					+ "Naturais Renov�veis) que � o principal org�o do governo federal para fiscaliza��o e controle\n"
					+ "do meio ambiente. � necess�rio primeiro ligar para a Linha Verde, o servi�o de ouvidoria pelo\n"
					+ "telefone: 0800 61 8080 ou pelo e-mail: linhaverde.sede@ibama.gov.br\n"
					+ "A liga��o � gratuita de qualquer parte do pa�s, de segunda a sexta das 8h �s 18h\n"
					+ "Em at� 30 dias ap�s a den�ncia, a unidade respons�vel devera se manifestar\n";
		case 2:
			return "\nDen�ncia Policia Militar Ambiental\n"
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
					+ "Zona Oeste e Sul: 11 3225-1085 e 1bpamb2cia1pel@policiamilitar.sp.gov.br\n";
		default:
			return null;
		}
	}


}
