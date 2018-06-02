package menu;

import application.Tools;

public class Problemas extends Menu implements Mensagens{
		
	@Override
	public void continueMenu() {		
		Tools.show("É de conhecimento geral que a estadia inconsiente do ser humano no nesse planeta, gera diversos problemas");
		boolean exit = false;
		this.setOpcao(1);
		while(!exit){
			Tools.show("Estudo de caso nº" + getOpcao() + ":");
			Tools.show(mensagem());
			Tools.menu("Como resolver esse problema", "Proximo problema", "Denunciar", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Solucoes s = new Solucoes();
			s.setOpcao(this.getOpcao());
			s.continueMenu();
			s = null;
			return false;
		case 2:
			this.setOpcao(getOpcao() + 1);
			mensagem();
			return false;
		case 3:
			Denuncias d = new Denuncias();
			d.continueMenu();
			d = null;
			return false;
		case 4:
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
