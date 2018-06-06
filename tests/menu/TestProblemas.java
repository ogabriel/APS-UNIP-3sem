package menu;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Problemas;

class TestProblemas {
	
	@Test
	void mensagem1() {
		Problemas p = new Problemas();
		p.setOpcao(1);
		assertEquals(p.mensagem(), "\nPolui��o\n"
				+ "A atmosfera e os oceanos sempre estiveram sobrecarregados de carbono. O CO2\n"
				+ "atmosf�rico absorve e reemite radia��o infravermelha, o que faz com que o ar,\n"
				+ "os solos e as �guas superficiais dos oceanos fiquem mais quentes. Por mais que\n"
				+ "pare�a estranho, isso � bom, o planeta estaria congelado se isso n�o acontecesse.\n"
				+ "Mas o problema surge quando h� muito carbono no ar. A queima de combust�veis\n"
				+ "f�sseis, o desmatamento para a agricultura e as atividades industriais aumentaram\n"
				+ "as concentra��es atmosf�ricas de CO2 de 280 partes por milh�o (ppm), h� 200 anos,\n"
				+ "para cerca de 400 ppm. Isso � um aumento em larga escala e de velocidade. O que\n"
				+ "resulta em perturba��es clim�ticas.\n");
	}
	
	@Test
	void mensagem2() {
		Problemas p = new Problemas();
		p.setOpcao(2);
		assertEquals(p.mensagem(), "\nSuperpopula��o\n"
				+ "A popula��o humana continua a crescer rapidamente em todo o mundo. A humanidade\n"
				+ "come�ou o s�culo 20 com 1,6 bilh�o de pessoas. Hoje j� s�o cerca de 7,5 bilh�es.\n"
				+ "Estimativas indicam que a popula��o mundial crescer� para quase 10 bilh�es at� 2050.\n"
				+ "A combina��o de crescimento populacional com ascens�o social est� pressionando cada\n"
				+ "vez mais os recursos naturais essenciais, como a �gua. Grande parte desse crescimento\n"
				+ "est� ocorrendo no continente africano e no sul e leste da �sia.\n");
	}
	
	@Test
	void mensagem3() {
		Problemas p = new Problemas();
		p.setOpcao(3);
		assertEquals(p.mensagem(), "\nDegrada��o do solo\n"
				+ "A explora��o excessiva das pastagens, as monoculturas, a eros�o, a compacta��o do solo,\n"
				+ "a exposi��o excessiva a poluentes, a convers�o de terras etc. a lista de maneiras como\n"
				+ "os solos est�o sendo danificados � longa. Cerca de 12 milh�es de hectares de terras agr�colas\n"
				+ "s�o degradados seriamente todos os anos, de acordo com estimativas da ONU.\n");
	}
	
	@Test
	void mensagem4() {
		Problemas p = new Problemas();
		p.setOpcao(4);
		assertEquals(p.mensagem(), "\nExtin��o de esp�cies\n"
				+ "Os animais selvagens est�o sendo ca�ados at� a extin��o para a obten��o de carne, marfim\n"
				+ "ou para a produ��o de produtos \"medicinais\". No mar, grandes barcos de pesca industrial,\n"
				+ "equipados com redes de arrast�o ou de cerco, est�o dizimando popula��es inteiras de peixes.\n"
				+ "A perda e a destrui��o de habitat tamb�m � um fator importante para a onda de extin��o. A\n"
				+ "Lista Vermelha da Uni�o Internacional para a Conserva��o da Natureza (IUCN) de esp�cies amea�adas\n"
				+ "continua a crescer.\n");
	}
	
	@Test
	void mensagem5() {
		Problemas p = new Problemas();
		p.setOpcao(5);
		assertEquals(p.mensagem(), "\nDesmatamento\n"
				+ "Florestas ricas em esp�cies est�o sendo destru�das, especialmente nos tr�picos, para na\n"
				+ "maioria das vezes abrir espa�o para a cria��o de gado, planta��es de soja ou de �leo de palma,\n"
				+ "ou para outras monoculturas agr�colas.\n"
				+ "Cerca de 30% da �rea terrestre do planeta � coberta por florestas, isso � cerca de metade do\n"
				+ "que existia antes de o in�cio da agricultura, 11 mil anos atr�s\n");
	}
	
	@Test
	void mensagem6() {
		Problemas p = new Problemas();
		p.setOpcao(6);
		assertEquals(p.mensagem(), "\nLixo\n"
				+ "A produ��o descontrolada de lixo dom�stico e industrial, devido a superpopula��o e do\n"
				+ "consumismo desenfreado � algo muito s�rio. Acredita-se que s� na cidade de S�o Paulo\n"
				+ "cada morador produza, durante sua vida, incr�veis 25 toneladas de lixo. Os n�meros se\n"
				+ "tornam ainda mais assustadores quando se tratam de pa�ses desenvolvidos, chegando a 40\n"
				+ "toneladas por pessoa. Em pouqu�ssimo tempo, n�o haver� mais onde descartar tanto lixo.\n"
				+ "Atualmente, j� ocorre a transfer�ncia de lixo para outros pa�ses e continentes.\n");
	}
	
	@Test
	void mensagem7() {
		Problemas p = new Problemas();
		p.setOpcao(7);
		assertEquals(p.mensagem(), "\n�gua\n"
				+ "A quest�o da polui��o das �guas e da falta de saneamento b�sico � uma das mais graves, pois\n"
				+ "sem �gua n�o podemos viver. N�o bastasse a coleta de esgotos e tratamento ser muito rara no pa�s,\n"
				+ "a polui��o se d� por toda esp�cie de subst�ncias qu�micas jogadas nos ralos. Considerando-se a\n"
				+ "polui��o dos oceanos pelas mesmas subst�ncias e pelos infind�veis vazamentos de petr�leo a situa��o,\n"
				+ "em 20 anos, pode se tornar dram�tica com a �gua sendo, inclusive, motivo para guerras.\n");
	}
	
	@Test
	void mensagem8() {
		Problemas p = new Problemas();
		p.setOpcao(8);
		assertEquals(p.mensagem(), "\nEduca��o\n"
				+ "Pode-se afirmar que poqu�ssimas pessoas tem alguma conci�ncia ambiental para o mundo a sua volta,\n"
				+ "n�o v�em qu�o em declinio esta o planeta por causa de nossas a��es. A educa��o sempre � a melhor\n"
				+ "solu��o pra tudo, mas mesmo assim a��es governamentais s�o poucas ou nulas para esse assunto.\n");
	}
}
