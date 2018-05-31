package application;

public class Denuncias extends Mensagens implements Escolhas{

	//	TODO: mudar para mensagem(), pq aqui so mostra informacao
	public void escolha(int resposta) {
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
