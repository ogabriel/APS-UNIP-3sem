package application;

import java.util.Scanner;

public class Denuncias extends Mensagens implements Escolhas{

	@Override
	public void continueMenu() {
		Scanner scan = new Scanner(System.in);
		boolean exit;
		do {
			Menu.menu("Ibama", "Polícia Ambiental", "Sair");
			int resposta = scan.nextInt();
			exit = escolha(resposta);
		} while (!exit);	
		scan.close();
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
