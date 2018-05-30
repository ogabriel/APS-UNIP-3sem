package application;

public class Engine implements Escolhas{
	public void inicio() {
		Menu.menu("Problemas ambientais", "Denuncias", "Sair");
		Mensagens opcao = escolha(Menu.input());
	}
	
	public Mensagens escolha(int resposta) {
		Mensagens m = null;
		switch (resposta) {
		case 1:
			m = new Problemas();
			break;
		case 2:
			m = new Denuncias();
			break;
		case 3:
			m = null;
			break;
		}
		return m;
	}
	
	
	public String opcao() {
		return null;
	}
}
