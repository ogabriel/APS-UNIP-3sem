package menu;

import application.Tools;

public class Problemas extends Menu implements Mensagens{
		
	@Override
	public void continueMenu() {		
		Tools.show("\nProblemas Ambientais\n"
				+ "É de suma importância que o humano saiba, os danos que sua própria especie vem\n"
				+ "causando ao planeta nos ultimos anos, principalmente nessa época onde a população\n"
				+ "aumentou muito, e a industria cresceu também para segurar a demanda");
		boolean exit = false;
		this.setOpcao(1);
		while(!exit){
			Tools.show("\nEstudo de caso nº" + getOpcao() + ":");
			Tools.show(mensagem());
			Tools.menu("Como resolver esse problema", "Proximo problema", "Problema anterior", "Denunciar", "Sair");
			int resposta = Tools.input();
			exit = escolha(resposta);
		}
	}
	
	@Override
	public boolean escolha(int resposta) {
		switch (resposta) {
		case 1:
			Solucoes s = new Solucoes();
			s.setOpcao(this.getOpcao());
			s.continueMenu();
			s = null;
			return false;
		case 2:
			if (getOpcao() < 8) {
				this.setOpcao(getOpcao() + 1);
				mensagem();
				return false;
			} else {
				Tools.show("\nlimite atingido");
				return false;
			}
		case 3:
			if (getOpcao() > 1) {
				this.setOpcao(getOpcao() - 1);
				mensagem();
				return false;
			} else {
				Tools.show("\nlimite atingido");
				return false;
			}		
		case 4:
			Denuncias d = new Denuncias();
			d.continueMenu();
			d = null;
			return false;
		case 5:
			return true;
		default:
			Tools.show("Opção invalida\n");
			return false;	
		}
	}
	
	@Override
	public String mensagem() {
		switch (getOpcao()) {
		case 1:
			return "\nPoluição\n"
					+ "A atmosfera e os oceanos sempre estiveram sobrecarregados de carbono. O CO2\n"
					+ "atmosférico absorve e reemite radiação infravermelha, o que faz com que o ar,\n"
					+ "os solos e as águas superficiais dos oceanos fiquem mais quentes. Por mais que\n"
					+ "pareça estranho, isso é bom, o planeta estaria congelado se isso não acontecesse.\n"
					+ "Mas o problema surge quando há muito carbono no ar. A queima de combustíveis\n"
					+ "fósseis, o desmatamento para a agricultura e as atividades industriais aumentaram\n"
					+ "as concentrações atmosféricas de CO2 de 280 partes por milhão (ppm), há 200 anos,\n"
					+ "para cerca de 400 ppm. Isso é um aumento em larga escala e de velocidade. O que\n"
					+ "resulta em perturbações climáticas.\n";
		case 2:
			return "\nSuperpopulação\n"
					+ "A população humana continua a crescer rapidamente em todo o mundo. A humanidade\n"
					+ "começou o século 20 com 1,6 bilhão de pessoas. Hoje já são cerca de 7,5 bilhões.\n"
					+ "Estimativas indicam que a população mundial crescerá para quase 10 bilhões até 2050.\n"
					+ "A combinação de crescimento populacional com ascensão social está pressionando cada\n"
					+ "vez mais os recursos naturais essenciais, como a água. Grande parte desse crescimento\n"
					+ "está ocorrendo no continente africano e no sul e leste da Ásia.\n";
		case 3:
			return "\nDegradação do solo\n"
					+ "A exploração excessiva das pastagens, as monoculturas, a erosão, a compactação do solo,\n"
					+ "a exposição excessiva a poluentes, a conversão de terras etc. a lista de maneiras como\n"
					+ "os solos estão sendo danificados é longa. Cerca de 12 milhões de hectares de terras agrícolas\n"
					+ "são degradados seriamente todos os anos, de acordo com estimativas da ONU.\n";
		case 4:
			return "\nExtinção de espécies\n"
					+ "Os animais selvagens estão sendo caçados até a extinção para a obtenção de carne, marfim\n"
					+ "ou para a produção de produtos \"medicinais\". No mar, grandes barcos de pesca industrial,\n"
					+ "equipados com redes de arrastão ou de cerco, estão dizimando populações inteiras de peixes.\n"
					+ "A perda e a destruição de habitat também é um fator importante para a onda de extinção. A\n"
					+ "Lista Vermelha da União Internacional para a Conservação da Natureza (IUCN) de espécies ameaçadas\n"
					+ "continua a crescer.\n";
		case 5:
			return "\nDesmatamento\n"
					+ "Florestas ricas em espécies estão sendo destruídas, especialmente nos trópicos, para na\n"
					+ "maioria das vezes abrir espaço para a criação de gado, plantações de soja ou de óleo de palma,\n"
					+ "ou para outras monoculturas agrícolas.\n"
					+ "Cerca de 30% da área terrestre do planeta é coberta por florestas, isso é cerca de metade do\n"
					+ "que existia antes de o início da agricultura, 11 mil anos atrás\n";
		case 6:
			return "\nLixo\n"
					+ "A produção descontrolada de lixo doméstico e industrial, devido a superpopulação e do\n"
					+ "consumismo desenfreado é algo muito sério. Acredita-se que só na cidade de São Paulo\n"
					+ "cada morador produza, durante sua vida, incríveis 25 toneladas de lixo. Os números se\n"
					+ "tornam ainda mais assustadores quando se tratam de países desenvolvidos, chegando a 40\n"
					+ "toneladas por pessoa. Em pouquíssimo tempo, não haverá mais onde descartar tanto lixo.\n"
					+ "Atualmente, já ocorre a transferência de lixo para outros países e continentes.\n";
		case 7:
			return "\nÁgua\n"
					+ "A questão da poluição das águas e da falta de saneamento básico é uma das mais graves, pois\n"
					+ "sem água nào podemos viver. Não bastasse a coleta de esgotos e tratamento ser muito rara no país,\n"
					+ "a poluição se dá por toda espécie de substâncias químicas jogadas nos ralos. Considerando-se a\n"
					+ "poluição dos oceanos pelas mesmas substâncias e pelos infindáveis vazamentos de petróleo a situação,\n"
					+ "em 20 anos, pode se tornar dramática com a água sendo, inclusive, motivo para guerras.\n";
		case 8:
			return "\nEducação\n"
					+ "Pode-se afirmar que poquíssimas pessoas tem alguma conciência ambiental para o mundo a sua volta,\n"
					+ "não vêem quão em declinio esta o planeta por causa de nossas ações. A educação sempre é a melhor\n"
					+ "solução pra tudo, mas mesmo assim ações governamentais são poucas ou nulas para esse assunto.\n";
		default:
			return null;
		}
	}
	
}
