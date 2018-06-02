package menu;

import application.Tools;

public class Denuncias extends Menu implements Mensagens{

	
	@Override
	public void continueMenu() {
		boolean exit = false;
		Tools.show("Os dois meios mais eficiêntes de denuncias no nosso pais atualmente são o Ibama e a Polícia Ambiental");
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
			return "mensagem Ibama";
		case 2:
			return "mensagem PA";
		default:
			return null;
		}
	}


}
