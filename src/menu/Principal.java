package application;

public class Engine extends Mensagens implements Escolhas{
	@Override
	public void continueMenu() {	
		boolean exit = false;
		while(!exit) {
			Menu.show("mensagem dahora");
			Menu.menu("Problemas ambientais", "Denuncias", "Sair");
			int resposta = Menu.input();
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
			Menu.show("Opção incorreta");
			return false;
		}
	}

	@Override
	public String mensagem() {
		// TODO Auto-generated method stub
		return null;
	}
}
