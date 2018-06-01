package application;

public class Solucoes extends Mensagens implements Escolhas{

	@Override
	public void continueMenu() {
		boolean exit = false;
		while(!exit) {	
			Menu.show(mensagem());
			Menu.menu("Denunciar problema", "Sair");
			int resposta = Menu.input();
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
			Menu.show("Opção invalida");
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
