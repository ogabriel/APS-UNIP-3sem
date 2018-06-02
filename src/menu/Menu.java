package menu;

public abstract class Menu {
	protected int opcao;
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public abstract boolean escolha(int resposta);
	public abstract void continueMenu();
}
