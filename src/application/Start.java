package application;

import menu.Principal;

public class Start {

	public static void main(String[] args) {
		//colocar metodo iniciacao do engine
		logo();
		Principal e = new Principal();
		e.continueMenu();
		logo();		
		
	}
	public static void logo() {
		System.out.println("\n _   _  _   _  _  ____\n| | | || \\ | ||	||    |\n| |_| ||  \\| || ||  __|\n|_____||_|\\__||_||_|");
        System.out.println("CI�NCIA DA COMPUTA��O\nAPS 2018 - 3�SEMESTRE\n ");
	}

}
