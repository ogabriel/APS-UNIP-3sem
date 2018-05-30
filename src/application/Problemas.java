package application;

public class Problemas extends Mensagens implements Escolhas{
	private int opcao;
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String escolha(int num) {
		String mensagem = "";
		switch (num) {
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
}
