package menu;

import application.Tools;

public class Solucoes extends Menu implements Mensagens{

	@Override
	public void continueMenu() {
		boolean exit = false;
		while(!exit) {	
			Tools.show(mensagem());
			Tools.menu("Denunciar problema", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Denuncias d = new Denuncias();
			d.continueMenu();
			d = null;
			return false;
		case 2:
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
			return "mensagem1";
		case 2:
			return "mensagem2";
		case 3:
			return "mensagem3";
		default:
			return null;
		}
	}
}
