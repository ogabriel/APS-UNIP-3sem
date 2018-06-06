package menu;

import application.Tools;

public class Denuncias extends Menu implements Mensagens{

	
	@Override
	public void continueMenu() {
		boolean exit = false;
		Tools.show("\nAs vezes por falta de opção é necessário intervir de outras formas para acabar\n"
				+ "com certos problemas ambientais. Os dois meios mais eficiêntes de denuncias no\n"
				+ "nosso paíss atualmente são o Ibama e a Polícia Ambiental\n");
		while(!exit) {		
			Tools.show("Opções disponíveis:");
			Tools.menu("Ibama", "Polícia Ambiental", "Sair");
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
				Tools.show("Opção invalida");
				return false;
		}
	}

	@Override
	public String mensagem() {
		switch (getOpcao()) {
		case 1:
			return "\nDenúncia Ibama\n"
					+ "Para efetuar uma denuncia pelo Ibama(Instituto Brasileiro do Meio Ambiente e dos Recursos\n"
					+ "Naturais Renováveis) que é o principal orgão do governo federal para fiscalização e controle\n"
					+ "do meio ambiente. É necessário primeiro ligar para a Linha Verde, o serviço de ouvidoria pelo\n"
					+ "telefone: 0800 61 8080 ou pelo e-mail: linhaverde.sede@ibama.gov.br\n"
					+ "A ligação é gratuita de qualquer parte do país, de segunda a sexta das 8h às 18h\n"
					+ "Em até 30 dias após a denúncia, a unidade responsável devera se manifestar\n";
		case 2:
			return "\nDenúncia Policia Militar Ambiental\n"
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
					+ "Zona Oeste e Sul: 11 3225-1085 e 1bpamb2cia1pel@policiamilitar.sp.gov.br\n";
		default:
			return null;
		}
	}


}
