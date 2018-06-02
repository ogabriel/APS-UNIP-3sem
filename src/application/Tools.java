package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {
	public static Scanner scan = new Scanner(System.in);
	
	public static void menu(String one, String two, String three, String four) {
		menu(one, two, three);
		System.out.println("4 - " + four);
	}
	
	public static void menu(String one, String two, String three) {
		menu(one, two);
		System.out.println("3 - " + three);
		
	}
	public static void menu(String one, String two) {
		System.out.println("1 - " + one);
		System.out.println("2 - " + two);
	}
	
	public static void show(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static int input() {
		int num = 0; 
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			show("Só são permitidos números");
			scan.next();
		}		
		return num;
	}
}
