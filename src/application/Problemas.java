package application;

public class Problemas extends Mensagens implements Escolhas{
	private int opcao;
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	@Override
	public String escolha(int resposta) {
		String mensagem = "";
		switch (resposta) {
		case 1:
			mensagem = "Solução";
			break;
		case 2:
			mensagem = "Próxima";
			break;
		case 3:
			mensagem = "Denuncia";
			break;
		case 4:
			mensagem = "Sair";
			break;	
		
		}
		
		return mensagem;
	}
	

	@Override
	public String mensagem(int atual) {
		switch (atual) {
		case 1:
			return "mensagem1";
		case 2:
			return "mensagem2";
		case 3:
			return "mensagem3";
		default:
			return null;
		}
	}
}
