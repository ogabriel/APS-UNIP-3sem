package application;

public class Solucoes extends Mensagens implements Escolhas{
	public String escolha(int resposta) {
		String mensagem = "";
		switch (resposta) {
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
