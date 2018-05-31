package application;

public class Engine implements Escolhas{
	public void inicio() {
		Menu.menu("Problemas ambientais", "Denuncias", "Sair");
		Mensagens opcao = escolha(Menu.input());
	}
	
	public void escolha(int resposta) {
		// TODO: organizar iniciacao das classes e os metodos de exibicao
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
