package application;

public class Denunciar extends Mensagens {
	public String escolha(int num) {
		String mensagem = "";
		
		switch(num) {
			case 1:
				mensagem = "Ibama";
			break;
			case 2:
				mensagem = "Pol�cia ambiental";
			break;
			case 3:
				mensagem = "Sair";
			break;
		}
		return mensagem;
	}
}