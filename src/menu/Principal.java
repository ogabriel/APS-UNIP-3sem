package menu;

import application.Tools;

public class Principal extends Menu {
	@Override
	public void continueMenu() {	
		boolean exit = false;
		while(!exit) {
			Tools.show("mensagem dahora");
			Tools.menu("Problemas ambientais", "Denuncias", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);		
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Problemas p = new Problemas();
			p.continueMenu();
			p = null;
			return false;
		case 2:
			Denuncias d = new Denuncias();
			d.continueMenu();
			d = null;
			return false;
		case 3:
			return true;
		default:
			Tools.show("Opção incorreta");
			return false;
		}
	}
}
