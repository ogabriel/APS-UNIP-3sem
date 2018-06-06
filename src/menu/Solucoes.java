package menu;

import application.Tools;

public class Solucoes extends Menu implements Mensagens{

	@Override
	public void continueMenu() {
		boolean exit = false;
		while(!exit) {	
			Tools.show(mensagem());
			Tools.menu("Denunciar problema", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Denuncias d = new Denuncias();
			d.continueMenu();
			d = null;
			return false;
		case 2:
			return true;		
		default:
			Tools.show("Op��o invalida");
			return false;
		}
	}

	@Override
	public String mensagem() {
		switch (getOpcao()) {
		case 1:
			return "Substituir os combust�veis f�sseis por energia renov�vel (paineis solares, turbinas\n"
					+ "e�licas etc); reflorestamento; reduzir as emiss�es originadas pela agricultura;\n"
					+ "alterar processos industriais. Tudo isso � totalmente poss�vel com a tecnologia\n"
					+ "atual da humanidade\n";
		case 2:
			return "Um dos primeiros procedimentos a serem colocados em pr�tica � o maior controle da\n"
					+ "natalidade, especialmente em pa�ses em desenvolvimento, como o caso da China, que\n"
					+ "tem cerca de 1,3 bilh�o de pessoas. O controle de natalidade permite simultaneamente\n"
					+ "uma melhoria ambiental e social, uma vez que evita o aumento da extra��o de recursos,\n"
					+ "al�m de diminuir a oferta de m�o-de-obra, o que favorece o crescimento salarial, pois\n"
					+ "as empresas teriam que lutar para conseguir trabalhadores, facilitaria a implanta��o\n"
					+ "de servi�os p�blicos de qualidade, entre muitos outros benef�cios.\n"
					+ "Dar mais acesso � educa��o e servi�os sociais b�sicos a mulheres em certos pa�ses, pois\n"
					+ "mulheres t�m o maior poder de controlar a sua pr�pria reprodu��o, assim o n�mero m�dio de\n"
					+ "nascimentos por mulher tende a cair significativamente.\n";
		case 3:
			return "H� uma vasta gama de t�cnicas de conserva��o e restaura��o do solo, como plantio direto,\n"
					+ "rota��o de culturas e a constru��o de \"terra�os\" para controle da eros�o pluvial. Considerando\n"
					+ "que a seguran�a alimentar depende da manuten��o dos solos em boas condi��es.";
		case 4:
			return "Esfor�os conjuntos devem ser feitos para evitar a diminui��o da biodiversidade. Proteger e recuperar\n"
					+ "habitats � apenas um lado da quest�o. Combater a ca�a e a pesca ilegais e o com�rcio de vidas selvagens\n"
					+ "� mais outro. Isso deve ser feito em parceria com popula��es locais, para que a conserva��o da vida selvagem\n"
					+ "seja do seu interesse, tanto social como econ�mico.\n";
		case 5:
			return "Conservar o que resta das florestas naturais e recuperar as �reas degradadas com o replantio\n"
					+ "de esp�cies arb�reas nativas. Isso exige um governo forte - s� que muitos pa�ses tropicais\n"
					+ "ainda est�o em desenvolvimento, t�m popula��es crescentes, carecem de um Estado de Direito e\n"
					+ "sofrem com nepotismo generalizado e corrup��o quando se trata do uso da terra.\n";
		case 6:
			return "A reciclagem e a coleta seletiva s�o indispens�veis, al�m de designar responsabilidade �s empresas\n"
					+ "no sentido dos res�duos industriais e as mercadorias que terminaram sua vida �til, como baterias de\n"
					+ "celulares, embalagens de pl�stico, pneus, entre muitos outros seguimentos.\n"
					+ "Al�m da concientiza��o da pr�pria popula��o.\n";
		case 7:
			return "No caso das �guas � preciso que haja um processo de despolui��o dos mananciais que se encontram\n"
					+ "polu�dos, preserva��o dos recursos h�dricos e fiscaliza��o do uso dos mesmos, tratamento rigoroso\n"
					+ "do esgoto, implanta��o residencial, comercial e industrial de reciclagem de �gua, recupera��o de\n"
					+ "�reas onde as matas ciliares encontram-se degradas.\n";
		case 8:
			return "Esse programa foi criado com o intuito de criar conci�ncia ambiental nas pessoas, pois antes de agir �\n"
					+ "sempre necess�rio saber o que dever� ser feito, quais os problemas que ser�o enfrentados e qual a\n"
					+ "dificuldades de passar por eles\n";
		default:
			return null;
		}
	}
}
