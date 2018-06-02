package application;

import menu.Principal;

public class Start {

	public static void main(String[] args) {
		logo();
		try {
			Principal e = new Principal();
			e.continueMenu();
		} catch (Exception e) {
			Tools.show(e.getMessage());
		}
		logo();		
		
	}
	public static void logo() {
		System.out.println("\n _   _  _   _  _  ____\n| | | || \\ | ||	||    |\n| |_| ||  \\| || ||  __|\n|_____||_|\\__||_||_|");
        System.out.println("CIÊNCIA DA COMPUTAÇÃO\nAPS 2018 - 3ºSEMESTRE\n ");
	}

}
