package application;

public class Engine implements Escolhas{
	public void start() {
		Menu.menu("Problemas ambientais", "Denuncias", "Sair");
		int opcao = Menu.input();
		escolha(opcao);
	}
	
	public void escolha(int resposta) {
		// TODO: organizar iniciacao das classes e os metodos de exibicao
		switch (resposta) {
		case 1:
			Problemas p = new Problemas();
			p.play();
			p = null;
			break;
		case 2:
			Denuncias d = new Denuncias();
			d.play();
			d = null;
			break;
		// TODO: metodo de exit ou retorno
		}
	}
	
	
	public String opcao() {
		return null;
	}
}
