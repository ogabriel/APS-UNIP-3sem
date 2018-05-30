package application;

public class Denuncias extends Mensagens implements Escolhas{
	public String escolha(int resposta) {
		String mensagem = "";
		
		switch(resposta) {
			case 1:
				mensagem = "Ibama";
			break;
			case 2:
				mensagem = "Polícia ambiental";
			break;
			case 3:
				mensagem = "Sair";
			break;
		}
		return mensagem;
	}
}
