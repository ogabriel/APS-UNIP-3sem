package application;

public class Denuncias extends Mensagens implements Escolhas{

	
	@Override
	public void continueMenu() {
		boolean exit = false;
		Menu.show("mensagem dahora");
		while(!exit) {		
			Menu.menu("Ibama", "Pol�cia Ambiental", "Sair");
			int resposta = Menu.input();
			exit = escolha(resposta);
		}	
	}
	
	@Override
	public boolean escolha(int resposta) {		
		switch(resposta) {
			case 1:
				this.opcao = 1;
				Menu.show(mensagem());
				return false;
			case 2:
				this.opcao = 2;
				Menu.show(mensagem());
				return false;
			case 3:
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
			return "mensagem Ibama";
		case 2:
			return "mensagem PA";
		default:
			return null;
		}
	}


}