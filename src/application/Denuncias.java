package application;

public class Denuncias extends Mensagens implements Escolhas{

	@Override
	public void continueMenu() {
		boolean exit = false;
		while(!exit) {		
			Menu.show("mensagem dahora");
			Menu.menu("Ibama", "Polícia Ambiental", "Sair");
			int resposta = Menu.input();
			exit = escolha(resposta);
		}	
	}
	
	@Override
	public boolean escolha(int resposta) {		
		switch(resposta) {
			case 1:
				this.opcao = 1;
				this.mensagem();
				return false;
			case 2:
				this.opcao = 2;
				this.mensagem();
				return false;
			case 3:
				return true;
			default:
				Menu.show("Opção invalida");
				return false;
		}
	}

	@Override
	public String mensagem() {
		
		// TODO: arriscar um show logo aqui, pra exibir a mensagem
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
