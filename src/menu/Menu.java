package menu;

public abstract class Mensagens {
	protected int opcao;
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public abstract String mensagem();
	public abstract void continueMenu();
}
