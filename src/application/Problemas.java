package application;

public class Problemas extends Mensagens{
	public String escolha(int num) {
		String mensagem = "";
		switch (num) {
		case 1:
			mensagem = "Solu��o";
			break;
		case 2:
			mensagem = "Pr�xima";
			break;
		case 3:
			mensagem = "Sair";
			break;
		case 4:
			mensagem = "Sair";
			break;	
		
		}
		
		return mensagem;
	}
}
