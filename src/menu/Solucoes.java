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
			Tools.show("Opção invalida");
			return false;
		}
	}

	@Override
	public String mensagem() {
		switch (getOpcao()) {
		case 1:
			return "Substituir os combustíveis fósseis por energia renovável (paineis solares, turbinas\n"
					+ "eólicas etc); reflorestamento; reduzir as emissões originadas pela agricultura;\n"
					+ "alterar processos industriais. Tudo isso é totalmente possível com a tecnologia\n"
					+ "atual da humanidade\n";
		case 2:
			return "Um dos primeiros procedimentos a serem colocados em prática é o maior controle da\n"
					+ "natalidade, especialmente em países em desenvolvimento, como o caso da China, que\n"
					+ "tem cerca de 1,3 bilhão de pessoas. O controle de natalidade permite simultaneamente\n"
					+ "uma melhoria ambiental e social, uma vez que evita o aumento da extração de recursos,\n"
					+ "além de diminuir a oferta de mão-de-obra, o que favorece o crescimento salarial, pois\n"
					+ "as empresas teriam que lutar para conseguir trabalhadores, facilitaria a implantação\n"
					+ "de serviços públicos de qualidade, entre muitos outros benefícios.\n"
					+ "Dar mais acesso à educação e serviços sociais básicos a mulheres em certos países, pois\n"
					+ "mulheres têm o maior poder de controlar a sua própria reprodução, assim o número médio de\n"
					+ "nascimentos por mulher tende a cair significativamente.\n";
		case 3:
			return "Há uma vasta gama de técnicas de conservação e restauração do solo, como plantio direto,\n"
					+ "rotação de culturas e a construção de \"terraços\" para controle da erosão pluvial. Considerando\n"
					+ "que a segurança alimentar depende da manutenção dos solos em boas condições.";
		case 4:
			return "Esforços conjuntos devem ser feitos para evitar a diminuição da biodiversidade. Proteger e recuperar\n"
					+ "habitats é apenas um lado da questão. Combater a caça e a pesca ilegais e o comércio de vidas selvagens\n"
					+ "é mais outro. Isso deve ser feito em parceria com populações locais, para que a conservação da vida selvagem\n"
					+ "seja do seu interesse, tanto social como econômico.\n";
		case 5:
			return "Conservar o que resta das florestas naturais e recuperar as áreas degradadas com o replantio\n"
					+ "de espécies arbóreas nativas. Isso exige um governo forte - só que muitos países tropicais\n"
					+ "ainda estão em desenvolvimento, têm populações crescentes, carecem de um Estado de Direito e\n"
					+ "sofrem com nepotismo generalizado e corrupção quando se trata do uso da terra.\n";
		case 6:
			return "A reciclagem e a coleta seletiva são indispensáveis, além de designar responsabilidade às empresas\n"
					+ "no sentido dos resíduos industriais e as mercadorias que terminaram sua vida útil, como baterias de\n"
					+ "celulares, embalagens de plástico, pneus, entre muitos outros seguimentos.\n"
					+ "Além da concientização da própria população.\n";
		case 7:
			return "No caso das águas é preciso que haja um processo de despoluição dos mananciais que se encontram\n"
					+ "poluídos, preservação dos recursos hídricos e fiscalização do uso dos mesmos, tratamento rigoroso\n"
					+ "do esgoto, implantação residencial, comercial e industrial de reciclagem de água, recuperação de\n"
					+ "áreas onde as matas ciliares encontram-se degradas.\n";
		case 8:
			return "Esse programa foi criado com o intuito de criar conciência ambiental nas pessoas, pois antes de agir é\n"
					+ "sempre necessário saber o que deverá ser feito, quais os problemas que serão enfrentados e qual a\n"
					+ "dificuldades de passar por eles\n";
		default:
			return null;
		}
	}
}
