package application;

public class Problemas extends Mensagens implements Escolhas{
		
	@Override
	public void continueMenu() {		
		boolean exit = false;
		this.opcao = 1;
		Menu.show("mensagem dahora");
		while(!exit){
			Menu.show(mensagem());
			Menu.menu("Como resolver esse problema", "Proximo problema", "Denunciar", "Sair");
			int resposta = Menu.input();
			exit = escolha(resposta);
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Solucoes s = new Solucoes();
			s.setOpcao(this.opcao);
			s.continueMenu();
			s = null;
			return false;
		case 2:
			this.opcao++;
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
			Menu.show("Op��o invalida");
			return false;	
		}
	}
	
	@Override
	public String mensagem() {
		switch (this.opcao) {
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