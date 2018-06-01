package application;

public class Engine implements Escolhas{
	public void start() {
		boolean exit;
		do {
			Menu.menu("Problemas ambientais", "Denuncias", "Sair");
			int resposta = Menu.input();
			exit = escolha(resposta);
		} while (exit);
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
	
	
	public String opcao() {
		return null;
	}
}
