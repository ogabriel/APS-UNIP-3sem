package menu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Solucoes;

class TestSolucoes {
	
	@Test
	void mensagem1() {
		Solucoes s = new Solucoes();
		s.setOpcao(1);		
		assertEquals(s.mensagem(), "Substituir os combustíveis fósseis por energia renovável (paineis solares, turbinas\n"
				+ "eólicas etc); reflorestamento; reduzir as emissões originadas pela agricultura;\n"
				+ "alterar processos industriais. Tudo isso é totalmente possível com a tecnologia\n"
				+ "atual da humanidade\n");
	}
	
	@Test
	void mensagem2() {
		Solucoes s = new Solucoes();
		s.setOpcao(2);		
		assertEquals(s.mensagem(), "Um dos primeiros procedimentos a serem colocados em prática é o maior controle da\n"
				+ "natalidade, especialmente em países em desenvolvimento, como o caso da China, que\n"
				+ "tem cerca de 1,3 bilhão de pessoas. O controle de natalidade permite simultaneamente\n"
				+ "uma melhoria ambiental e social, uma vez que evita o aumento da extração de recursos,\n"
				+ "além de diminuir a oferta de mão-de-obra, o que favorece o crescimento salarial, pois\n"
				+ "as empresas teriam que lutar para conseguir trabalhadores, facilitaria a implantação\n"
				+ "de serviços públicos de qualidade, entre muitos outros benefícios.\n"
				+ "Dar mais acesso à educação e serviços sociais básicos a mulheres em certos países, pois\n"
				+ "mulheres têm o maior poder de controlar a sua própria reprodução, assim o número médio de\n"
				+ "nascimentos por mulher tende a cair significativamente.\n");
	}
	
	@Test
	void mensagem3() {
		Solucoes s = new Solucoes();
		s.setOpcao(3);		
		assertEquals(s.mensagem(), "Há uma vasta gama de técnicas de conservação e restauração do solo, como plantio direto,\n"
				+ "rotação de culturas e a construção de \"terraços\" para controle da erosão pluvial. Considerando\n"
				+ "que a segurança alimentar depende da manutenção dos solos em boas condições.");
	}
	
	@Test
	void mensagem4() {
		Solucoes s = new Solucoes();
		s.setOpcao(4);		
		assertEquals(s.mensagem(), "Esforços conjuntos devem ser feitos para evitar a diminuição da biodiversidade. Proteger e recuperar\n"
				+ "habitats é apenas um lado da questão. Combater a caça e a pesca ilegais e o comércio de vidas selvagens\n"
				+ "é mais outro. Isso deve ser feito em parceria com populações locais, para que a conservação da vida selvagem\n"
				+ "seja do seu interesse, tanto social como econômico.\n");
	}
	
	@Test
	void mensagem5() {
		Solucoes s = new Solucoes();
		s.setOpcao(5);		
		assertEquals(s.mensagem(), "Conservar o que resta das florestas naturais e recuperar as áreas degradadas com o replantio\n"
				+ "de espécies arbóreas nativas. Isso exige um governo forte - só que muitos países tropicais\n"
				+ "ainda estão em desenvolvimento, têm populações crescentes, carecem de um Estado de Direito e\n"
				+ "sofrem com nepotismo generalizado e corrupção quando se trata do uso da terra.\n");
	}
	
	@Test
	void mensagem6() {
		Solucoes s = new Solucoes();
		s.setOpcao(6);		
		assertEquals(s.mensagem(), "A reciclagem e a coleta seletiva são indispensáveis, além de designar responsabilidade às empresas\n"
				+ "no sentido dos resíduos industriais e as mercadorias que terminaram sua vida útil, como baterias de\n"
				+ "celulares, embalagens de plástico, pneus, entre muitos outros seguimentos.\n"
				+ "Além da concientização da própria população.\n");
	}
	
	@Test
	void mensagem7() {
		Solucoes s = new Solucoes();
		s.setOpcao(7);		
		assertEquals(s.mensagem(), "No caso das águas é preciso que haja um processo de despoluição dos mananciais que se encontram\n"
				+ "poluídos, preservação dos recursos hídricos e fiscalização do uso dos mesmos, tratamento rigoroso\n"
				+ "do esgoto, implantação residencial, comercial e industrial de reciclagem de água, recuperação de\n"
				+ "áreas onde as matas ciliares encontram-se degradas.\n");
	}
	
	@Test
	void mensagem8() {
		Solucoes s = new Solucoes();
		s.setOpcao(8);		
		assertEquals(s.mensagem(), "Esse programa foi criado com o intuito de criar conciência ambiental nas pessoas, pois antes de agir é\n"
				+ "sempre necessário saber o que deverá ser feito, quais os problemas que serão enfrentados e qual a\n"
				+ "dificuldades de passar por eles\n");
	}
	
}
