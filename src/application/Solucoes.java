package application;

public class Solucoes extends Mensagens implements Escolhas{
	public String escolha(int num) {
		String mensagem = "";
		switch (num) {
		case 1:
			mensagem = "Denunciar";
			break;
		case 2:
			mensagem = "Sair";
			break;
		}
		return mensagem;
	}
}
